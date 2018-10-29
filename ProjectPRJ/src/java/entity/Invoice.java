/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Vu
 */
public class Invoice {
    private int invoiceID;
    private Date orderTime;
    private int userID;
    private String address;
    private String phoneNumber;

    public Invoice() {
    }

    public Invoice(int invoiceID, Date orderTime, int userID, String address, String phoneNumber) {
        this.invoiceID = invoiceID;
        this.orderTime = orderTime;
        this.userID = userID;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public int getUserID() {
        return userID;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
