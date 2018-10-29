/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public List<User> selectAll() throws Exception {
        List<User> users = new ArrayList<>();
        String query = "select * from [User]";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int userID = rs.getInt("UserID");
            String userName = rs.getString("Username");
            String password = rs.getString("Password");
            String name = rs.getString("Name");
            String email = rs.getString("Email");
            String avatarUrl = rs.getString("AvatarUrl");
            int role = rs.getInt("Role");
            int active = rs.getInt("Active");
            users.add(new User(userID, userName, password, name, email, avatarUrl, role, active));
        }
        rs.close();
        con.close();
        return users;
    }
    
    public List<User> searchByID(int usID) throws Exception {
        List<User> users = new ArrayList<>();
        String query = "select * from [User] where UserID like N'%"+usID+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int userID = rs.getInt("UserID");
            String userName = rs.getString("Username");
            String password = rs.getString("Password");
            String name = rs.getString("Name");
            String email = rs.getString("Email");
            String avatarUrl = rs.getString("AvatarUrl");
            int role = rs.getInt("Role");
            int active = rs.getInt("Active");
            users.add(new User(userID, userName, password, name, email, avatarUrl, role, active));
        }
        rs.close();
        con.close();
        return users;
    }
    
    public List<User> searchByOther(String value, String coloum) throws Exception {
        List<User> users = new ArrayList<>();
        String query = "select * from [User] where "+coloum+" like N'%"+value+"%'";
        Connection con = new DBContext().getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int userID = rs.getInt("UserID");
            String userName = rs.getString("Username");
            String password = rs.getString("Password");
            String name = rs.getString("Name");
            String email = rs.getString("Email");
            String avatarUrl = rs.getString("AvatarUrl");
            int role = rs.getInt("Role");
            int active = rs.getInt("Active");
            users.add(new User(userID, userName, password, name, email, avatarUrl, role, active));
        }
        rs.close();
        con.close();
        return users;
    }
    
    public void setStatus(int value1, int value2) throws  Exception{
        String query = "UPDATE [User] set Active = "+value1+" where UserID = "+value2;
        Connection con = new DBContext().getConnection();
        Statement stmt = con.createStatement();
        stmt.executeQuery(query);
        stmt.close();
        con.close();
    }
}
