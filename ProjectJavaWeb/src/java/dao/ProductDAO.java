/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ProductDAO {
    public List<Product> select(int shopidInput) throws Exception {
        List<Product> product = new ArrayList<>();
        String query = "select * from [Product] where shopid=?";
        Connection con = new DBContext().getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, shopidInput);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int productId = rs.getInt("productId");
            int shopid = rs.getInt("shopid");
            String name = rs.getString("name").trim();
            String image = rs.getString("image").trim();
            double  price = rs.getDouble("price");
            product.add(new Product(productId, shopid, name, image, price));
        }
        rs.close();
        con.close();
        return product;
    }
}
