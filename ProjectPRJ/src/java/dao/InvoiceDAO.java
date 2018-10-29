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
            invoices.add(new Invoice(invoiceID, orderTime, userID, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
    
    public List<Invoice> searchByInvoiceID(int invoicesID) throws Exception {
        List<Invoice> invoices = new ArrayList<>();
        String query = "select * from [Invoice] where InvoiceID like N'%"+invoicesID+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int invoiceID = rs.getInt("InvoiceID");
            Date orderTime = rs.getDate("OrderTime");
            int userID = rs.getInt("UserID");
            String address = rs.getString("Address");
            String phoneNumber = rs.getString("PhoneNumber");
            invoices.add(new Invoice(invoiceID, orderTime, userID, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
    
    public List<Invoice> searchByUserID(int usersID) throws Exception {
        List<Invoice> invoices = new ArrayList<>();
        String query = "select * from [Invoice] where UserID like N'%"+usersID+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int userID = rs.getInt("UserID");
            int invoiceID = rs.getInt("InvoiceID");
            Date orderTime = rs.getDate("OrderTime");
            String address = rs.getString("Address");
            String phoneNumber = rs.getString("PhoneNumber");
            invoices.add(new Invoice(invoiceID, orderTime, userID, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
    
    public List<Invoice> searchByOrderTime(Date ordersTime) throws Exception {
        List<Invoice> invoices = new ArrayList<>();
        String query = "select * from [Invoice] where OrderTime like N'%"+ordersTime+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int invoiceID = rs.getInt("InvoiceID");
            String address = rs.getString("Address");
            Date orderTime = rs.getDate("OrderTime");
            int userID = rs.getInt("UserID");
            String phoneNumber = rs.getString("PhoneNumber");
            invoices.add(new Invoice(invoiceID, orderTime, userID, address, phoneNumber));
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
            invoices.add(new Invoice(invoiceID, orderTime, userID, address, phoneNumber));
        }
        rs.close();
        con.close();
        return invoices;
    }
}
