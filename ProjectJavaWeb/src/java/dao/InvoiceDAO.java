/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.Invoice;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vu
 */
public class InvoiceDAO {
    public List<Invoice> selectAll() throws Exception {
        List<Invoice> invoices = new ArrayList<>();
        String query = "select * from [Invoice]";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int invoiceID = rs.getInt("InvoiceID");
            Date orderTime = rs.getDate("OrderTime");
            int userID = rs.getInt("UserID");
            String address = rs.getString("Address");
            String phoneNumber = rs.getString("PhoneNumber");
            invoices.add(new Invoice(invoiceID, userID,orderTime, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
    
    public List<Invoice> searchByInvoiceID(int invoiceID) throws Exception {
        List<Invoice> invoices = new ArrayList<>();
        String query = "select * from [Invoice] where InvoiceID = "+invoiceID;
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            Date orderTime = rs.getDate("OrderTime");
            int userID = rs.getInt("UserID");
            String address = rs.getString("Address");
            String phoneNumber = rs.getString("PhoneNumber");
            invoices.add(new Invoice(invoiceID, userID,orderTime, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
    
    public List<Invoice> searchByUserID(int userID) throws Exception {
        List<Invoice> invoices = new ArrayList<>();
        String query = "select * from [Invoice] where UserID like N'%"+userID+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int invoiceID = rs.getInt("InvoiceID");
            Date orderTime = rs.getDate("OrderTime");
            String address = rs.getString("Address");
            String phoneNumber = rs.getString("PhoneNumber");
            invoices.add(new Invoice(invoiceID, userID,orderTime, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
    
    public List<Invoice> searchByOrderTime(Date orderTime) throws Exception {
        List<Invoice> invoices = new ArrayList<>();
        String query = "select * from [Invoice] where OrderTime like N'%"+orderTime+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int invoiceID = rs.getInt("InvoiceID");
            String address = rs.getString("Address");
            int userID = rs.getInt("UserID");
            String phoneNumber = rs.getString("PhoneNumber");
            invoices.add(new Invoice(invoiceID, userID,orderTime, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
    
    public List<Invoice> searchByOther(String value, String coloum) throws Exception {
        List<Invoice> invoices = new ArrayList<>();
        String query = "select * from [Invoice] where "+coloum+" like N'%"+value+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int invoiceID = rs.getInt("InvoiceID");
            String address = rs.getString("Address");
            int userID = rs.getInt("UserID");
            Date orderTime = rs.getDate("OrderTime");
            String phoneNumber = rs.getString("PhoneNumber");
            invoices.add(new Invoice(invoiceID, userID,orderTime, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
}
