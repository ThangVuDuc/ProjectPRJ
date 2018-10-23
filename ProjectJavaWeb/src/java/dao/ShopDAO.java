/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.Shop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ShopDAO {

    public List<Shop> select() throws Exception {
        List<Shop> shop = new ArrayList<>();
        String query = "select * from [Shop]";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while (rs.next()) {
            int shopid = rs.getInt("shopid");
            int userId = rs.getInt("userid");
            String title = rs.getString("title").trim();
            String description = rs.getString("description").trim();
            boolean openOrClose = rs.getBoolean("openOrClose");
            shop.add(new Shop(shopid, userId, title, description, openOrClose));
        }
        rs.close();
        con.close();
        return shop;
    }

    public Shop selectById(int shopidInput) throws Exception {
        String query = "select * from [Shop] WHERE shopid=?";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, shopidInput);
        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            return null;//ko co
        }
        int shopid = rs.getInt("shopid");
        int userId = rs.getInt("userid");
        String title = rs.getString("title").trim();
        String description = rs.getString("description").trim();
        boolean openOrClose = rs.getBoolean("openOrClose");
        Shop shop = new Shop(shopid, userId, title, description, openOrClose);

        rs.close();
        conn.close();
        return shop;
    }

    public int insert(Shop shop) {
        try (Connection con = new DBContext().getConnection()) {
            String sql = "INSERT INTO [Shop](userId,title,description,openOrClose) values(?,?,?,?)";
            String[] gererates = {"shopId"};
            PreparedStatement psmt = con.prepareStatement(sql, gererates);
//            psmt.setInt(1, c.getId());
            psmt.setInt(1, shop.getUserId());
            psmt.setString(2, shop.getTitle());
            psmt.setString(3, shop.getDescription());
            psmt.setBoolean(4, shop.isOpenOrClose());
            psmt.executeUpdate();
            
            ResultSet rs = psmt.getGeneratedKeys();
            if (rs.next()) {
                shop.setShopId(rs.getInt(1));
            }
            return 1;
        } catch (SQLException ex) {
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }

    public int update(Shop shop) throws Exception {
        int k = 0;
        try (Connection con = new DBContext().getConnection();) {
            String sql = "UPDATE [Shop] SET title=?, description=?,"
                    + "openOrClose=? WHERE shopid=?";
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, shop.getTitle());
            psmt.setString(2, shop.getDescription());
            psmt.setBoolean(3, shop.isOpenOrClose());
            psmt.setInt(4, shop.getShopId());
            k = psmt.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            return -1;
        } catch (Exception ex) {
            System.out.println(ex);
            return -1;
        }
        return k;
    }
}
