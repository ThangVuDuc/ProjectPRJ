package dao;

import Context.DBContext;
import entity.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    //select
    public Users selectByUsername(String usernameInput) throws Exception {
        String query = "select * from [User] WHERE Username=?";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, usernameInput);
        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            return null;//ko co
        }
        String username = rs.getString("username").trim();
        String password = rs.getString("password").trim();
        String email = rs.getString("email").trim();
        String avatarUrl = rs.getString("avatarUrl").trim();
        int role = rs.getInt("role");
        String name = rs.getString("name").trim();
        Users user = new Users(username, password, email, name, avatarUrl, role);

        rs.close();
        conn.close();
        return user;
    }

    public List<Users> select() throws Exception {
        List<Users> user = new ArrayList<>();
        String query = "select * from [User]";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while (rs.next()) {
            String username = rs.getString("username").trim();
            String password = rs.getString("password").trim();
            String email = rs.getString("email").trim();
            String avatarUrl = rs.getString("avatarUrl").trim();
            int role = rs.getInt("role");
            String name = rs.getString("name").trim();
            user.add(new Users(username, password, email, name, avatarUrl, role));
        }
        rs.close();
        con.close();
        return user;
    }

    //insert
    public int insert(Users user) {
        try(Connection con = new DBContext().getConnection()) {
            String sql = "INSERT INTO [User](username, password,name,email,avatarurl,role ) values(?,?,?,?,?,?)";
            PreparedStatement psmt = con.prepareStatement(sql);
//            psmt.setInt(1, c.getId());
            psmt.setString(1, user.getUsername());
            psmt.setString(2, user.getPassword());
            psmt.setString(3, user.getName());
            psmt.setString(4, user.getEmail());
            psmt.setString(5, user.getAvatarUrl());
            psmt.setInt(6, user.getRole());
            psmt.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }

    //delete
    //update
}
