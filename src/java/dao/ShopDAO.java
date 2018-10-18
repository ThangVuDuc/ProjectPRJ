/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.Shop;
import java.sql.Connection;
import java.sql.ResultSet;
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
            shop.add(new Shop(shopid,userId, title, description, openOrClose));
        }
        rs.close();
        con.close();
        return shop;
    }
}
