/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.InvoiceLineDAO;
import entity.InvoiceLine;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Vu
 */
public class InvoiceBean implements Serializable {

    private String invoiceid;

    public InvoiceBean() {
    }

    public InvoiceBean(String invoiceid) {
        this.invoiceid = invoiceid;
    }

    public String getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

    public List<InvoiceLine> getInvoice() {
        try {
            System.out.println(invoiceid);
            List<InvoiceLine> list = new InvoiceLineDAO().selectAll(Integer.valueOf(invoiceid));
            System.out.println(list);
            return list;
            
        }catch(Exception ex){
            
        }
        return null;
    }
}
