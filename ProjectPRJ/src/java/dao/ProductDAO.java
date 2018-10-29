/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vu
 */
public class ProductDAO {
    public List<Product> selectAll() throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from [Product]";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int productID = rs.getInt("ProductID");
            int shopID = rs.getInt("ShopID");
            String name = rs.getString("Name");
            String image = rs.getString("Image");
            float price = rs.getFloat("Price");
            products.add(new Product(productID, shopID, name, image, price));
        }
        rs.close();
        con.close();
        return products;
    }
    
    public List<Product> selectAllByShopID(int sopID) throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from [Product] where ShopID = "+sopID;
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int shopID = rs.getInt("ShopID");
            int productID = rs.getInt("ProductID");
            String name = rs.getString("Name");
            String image = rs.getString("Image");
            float price = rs.getFloat("Price");
            products.add(new Product(productID, shopID, name, image, price));
        }
        rs.close();
        con.close();
        return products;
    }
    
    public List<Product> searchByProductID(int proID) throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from [Product] where ProductID like N'%"+proID+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int productID = rs.getInt("ProductID");
            int shopID = rs.getInt("ShopID");
            String name = rs.getString("Name");
            String image = rs.getString("Image");
            float price = rs.getFloat("Price");
            products.add(new Product(productID, shopID, name, image, price));
        }
        rs.close();
        con.close();
        return products;
    }
    
    public List<Product> searchByPrice(int prices) throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from [Product] where Price like N'%"+prices+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int productID = rs.getInt("ProductID");
            int shopID = rs.getInt("ShopID");
            String name = rs.getString("Name");
            String image = rs.getString("Image");
            float price = rs.getFloat("Price");
            products.add(new Product(productID, shopID, name, image, price));
        }
        rs.close();
        con.close();
        return products;
    }
    
    public List<Product> searchByOther(String value, String coloum) throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from [Product] where "+coloum+" like N'%"+value+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int productID = rs.getInt("ProductID");
            int shopID = rs.getInt("ShopID");
            String name = rs.getString("Name");
            String image = rs.getString("Image");
            float price = rs.getFloat("Price");
            products.add(new Product(productID, shopID, name, image, price));
        }
        rs.close();
        con.close();
        return products;
    }
    
    public List<Product> searchByShopIDAndProductID(int sopID, int proID) throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from [Product] where ShopID = "+sopID+" and ProductID like N'%"+proID+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int shopID = rs.getInt("ShopID");
            int productID = rs.getInt("ProductID");
            String name = rs.getString("Name");
            String image = rs.getString("Image");
            float price = rs.getFloat("Price");
            products.add(new Product(productID, shopID, name, image, price));
        }
        rs.close();
        con.close();
        return products;
    }
    
    public List<Product> searchByShopIDAndNameImage(int sopID, String names,String coloum) throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from [Product] where ShopID = "+sopID+" and "+coloum+" like N'%"+names+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int shopID = rs.getInt("ShopID");
            int productID = rs.getInt("ProductID");
            String name = rs.getString("Name");
            String image = rs.getString("Image");
            float price = rs.getFloat("Price");
            products.add(new Product(productID, shopID, name, image, price));
        }
        rs.close();
        con.close();
        return products;
    }
    
    public List<Product> searchByShopIDAndPrice(int sopID, float prices) throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from [Product] where ShopID = "+sopID+" and Price = "+prices+"";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int shopID = rs.getInt("ShopID");
            int productID = rs.getInt("ProductID");
            String name = rs.getString("Name");
            String image = rs.getString("Image");
            float price = rs.getFloat("Price");
            products.add(new Product(productID, shopID, name, image, price));
        }
        rs.close();
        con.close();
        return products;
    }
    
}
