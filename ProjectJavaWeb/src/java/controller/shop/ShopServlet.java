/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.shop;

import Context.DBContext;
import entity.Shop;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class ShopServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            JsonObjectBuilder job = Json.createObjectBuilder();

            int page = Integer.parseInt(request.getParameter("page").trim());
            int pageSize = Integer.parseInt(request.getParameter("pageSize").trim());
            int from = (page - 1) * pageSize + 1;
            int to = page * pageSize;
            String store = "{call GetShops(?,?)}";
            Connection conn = new DBContext().getConnection();
            CallableStatement cs = conn.prepareCall(store);
            cs.setInt(1, from);
            cs.setInt(2, to);
            ResultSet rs = cs.executeQuery();
            JsonArrayBuilder builder2 = Json.createArrayBuilder();
            
            while (rs.next()) {
                int shopid = rs.getInt("shopid");
                int userid = rs.getInt("userid");
                String title = rs.getString("title");
                String description = rs.getString("description");
                boolean openOrClose = rs.getBoolean("openOrClose");
                builder2.add(Json.createObjectBuilder().add("shopid", shopid)
                        .add("userid", userid)
                        .add("title", title)
                        .add("description", description)
                        .add("openOrClose", openOrClose).build());
            }
            JsonArray array2 = builder2.build();
            // add contacts array object
            job.add("shops", array2);
            rs.close();
            conn.close();
            JsonObject jo = job.build();
            out.write(jo.toString());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ShopServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ShopServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
