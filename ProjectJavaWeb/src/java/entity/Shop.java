package entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Shop {
    private int shopId;
    private int  userId;
    private String title;
    private String description;
    private boolean openOrClose;

    public Shop() {
    }

    public Shop(int userId, String title, String description, boolean openOrClose) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.openOrClose = openOrClose;
    }

    public Shop(int shopId, int userId, String title, String description, boolean openOrClose) {
        this.shopId = shopId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.openOrClose = openOrClose;
    }
    
    public int getShopId() {
        return shopId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOpenOrClose() {
        return openOrClose;
    }

    public void setOpenOrClose(boolean openOrClose) {
        this.openOrClose = openOrClose;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    
    
}
