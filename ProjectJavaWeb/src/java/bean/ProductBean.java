/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.ProductDAO;
import entity.Product;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ProductBean {
    private int shopId;

    public ProductBean() {
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    
    public List<Product> getProducts() throws Exception{
        ProductDAO productdao=new ProductDAO();
        List<Product> products=productdao.select(shopId);
        return products;
    }
}
