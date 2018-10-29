/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DBContext;
import entity.InvoiceLine;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vu
 */
public class InvoiceLineDAO {
    public List<InvoiceLine> selectAll(int invoiceID) throws Exception {
        List<InvoiceLine> invoicelines = new ArrayList<>();
        String query = "select * from [InvoiceLine] where InvoiceID = "+invoiceID;
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int productID = rs.getInt("ProductID");
            int quatity = rs.getInt("Quatity");
            int unitprice = rs.getInt("UnitPrice");
            String note = rs.getString("Note");
            invoicelines.add(new InvoiceLine(invoiceID, productID, quatity, unitprice, note));
        }
        rs.close();
        con.close();
        return invoicelines;
    }
    
    public List<InvoiceLine> selectByProductQuatityPrice(int invoiceID, int value, String coloum) throws Exception {
        List<InvoiceLine> invoicelines = new ArrayList<>();
        String query = "select * from [InvoiceLine] where InvoiceID = "+invoiceID+" and "+coloum+" like N'%"+value+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int productID = rs.getInt("ProductID");
            int quatity = rs.getInt("Quatity");
            int unitprice = rs.getInt("UnitPrice");
            String note = rs.getString("Note");
            invoicelines.add(new InvoiceLine(invoiceID, productID, quatity, unitprice, note));
        }
        rs.close();
        con.close();
        return invoicelines;
    }
    
    public List<InvoiceLine> selectByNote(int invoiceID, String notes) throws Exception {
        List<InvoiceLine> invoicelines = new ArrayList<>();
        String query = "select * from [InvoiceLine] where InvoiceID = "+invoiceID+" and Note like N'%"+notes+"%'";
        Connection con = new DBContext().getConnection();
        ResultSet rs = con.prepareStatement(query).executeQuery();
        while(rs.next()){
            int productID = rs.getInt("ProductID");
            int quatity = rs.getInt("Quatity");
            int unitprice = rs.getInt("UnitPrice");
            String note = rs.getString("Note");
            invoicelines.add(new InvoiceLine(invoiceID, productID, quatity, unitprice, note));
        }
        rs.close();
        con.close();
        return invoicelines;
    }
}
