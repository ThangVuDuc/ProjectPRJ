/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Vu
 */
public class Product {
    private int productID;
    private int shopID;
    private String name;
    private String image;
    private float price;

    public Product(int productID, int shopID, String name, String image, float price) {
        this.productID = productID;
        this.shopID = shopID;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public Product() {
    }

    public int getProductID() {
        return productID;
    }

    public int getShopID() {
        return shopID;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public float getPrice() {
        return price;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
