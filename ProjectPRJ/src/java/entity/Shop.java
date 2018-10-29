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
public class Shop {
    private int shopID;
    private int userID;
    private String title;
    private String description;
    private boolean openOrClose;

    public Shop() {
    }

    public Shop(int shopID, int userID, String title, String description, boolean openOrClose) {
        this.shopID = shopID;
        this.userID = userID;
        this.title = title;
        this.description = description;
        this.openOrClose = openOrClose;
    }

    public int getShopID() {
        return shopID;
    }

    public int getUserID() {
        return userID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isOpenOrClose() {
        return openOrClose;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOpenOrClose(boolean openOrClose) {
        this.openOrClose = openOrClose;
    }

}
