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
 * @author Vu
 */
public class ShopDAO {
    public List<Shop> selectAll() throws Exception {
        List<Shop> shops = new ArrayList<>();
        String query = "select * from [Shop]";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int shopID = rs.getInt("ShopID");
            int userID = rs.getInt("UserID");
            String title = rs.getString("Title");
            String description = rs.getString("Description");
            boolean openOrClose = rs.getBoolean("OpenOrClose");
            shops.add(new Shop(shopID, userID, title, description, openOrClose));
        }
        rs.close();
        con.close();
        return shops;
    }
    
    public List<Shop> searchByID(int shID) throws Exception {
        List<Shop> shops = new ArrayList<>();
        String query = "select * from [Shop] where ShopID like N'%"+shID+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int shopID = rs.getInt("ShopID");
            int userID = rs.getInt("UserID");
            String title = rs.getString("Title");
            String description = rs.getString("Description");
            boolean openOrClose = rs.getBoolean("OpenOrClose");
            shops.add(new Shop(shopID, userID, title, description, openOrClose));
        }
        rs.close();
        con.close();
        return shops;
    }
    
    public List<Shop> searchByOpenOrClose(boolean openOrClose) throws Exception {
        List<Shop> shops = new ArrayList<>();
        int i = 0;
        if(openOrClose == true){
            i = 1;
        }else{
            i = 0;
        }
        String query = "select * from [Shop] where OpenOrClose = "+i;
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int shopID = rs.getInt("ShopID");
            int userID = rs.getInt("UserID");
            String title = rs.getString("Title");
            String description = rs.getString("Description");
            shops.add(new Shop(shopID, userID, title, description, openOrClose));
        }
        rs.close();
        con.close();
        return shops;
    }
    
    public List<Shop> searchByOther(String value, String coloum) throws Exception {
        List<Shop> shops = new ArrayList<>();
        String query = "select * from [Shop] where "+coloum+" like N'%"+value+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int shopID = rs.getInt("ShopID");
            int userID = rs.getInt("UserID");
            String title = rs.getString("Title");
            String description = rs.getString("Description");
            boolean openOrClose = rs.getBoolean("OpenOrClose");
            shops.add(new Shop(shopID, userID, title, description, openOrClose));
        }
        rs.close();
        con.close();
        return shops;
    }
}
