/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.authenticate;

import dao.UserDAO;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author ASUS
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 50, // 50MB
        maxRequestSize = 1024 * 1024 * 50,// 50MB
        location = "C:\\Users\\ASUS\\Desktop\\ProjectJavaWeb\\web\\public\\images")
public class SigupServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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
//        processRequest(request, response);
        request.getRequestDispatcher("container/user/SignUp.jsp").forward(request, response);
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

        HttpSession session = request.getSession();
        String fileName = null;
        String username = request.getParameter("username").trim();
        UserDAO userdao = new UserDAO();
        
        //check loi up anh
        try {
            Part part = request.getPart("avatarUrl");
            fileName = username+"."+extractFileName(part);
            if (fileName != null && fileName.length() > 0) {
                System.out.println("filename " + fileName);
                System.out.println("part " + part);
                part.write(fileName);
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        String password = request.getParameter("password").trim();
        String email = request.getParameter("email").trim();
        String name = request.getParameter("name").trim();
        int role = 1;
        try {
            role = Integer.parseInt(request.getParameter("role").trim());
        } catch (Exception e) {
            System.out.println("ko la admin");
        }
        Users user = new Users(username, password, email, name, fileName, role);
        
        //check loi trung username
        
        if (userdao.insert(user) != -1) {
            session.removeAttribute("error");
            session.setAttribute("user", user);
            response.sendRedirect("container/user/Home.jsp");
        } else {
            session.setAttribute("error", "Username or email is existed");
            response.sendRedirect("container/user/SignUp.jsp");
        }

        //
    }
     private String extractFileName(Part part) {
       // form-data; name="file"; filename="C:\file1.zip"
       // form-data; name="file"; filename="C:\Note\file2.zip"
       String contentDisp = part.getHeader("content-disposition");
       String[] items = contentDisp.split(";");
       for (String s : items) {
           if (s.trim().startsWith("filename")) {
               // C:\file1.zip
               // C:\Note\file2.zip
               String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
//               clientFileName = clientFileName.replace("\\", "/");
               int i = clientFileName.lastIndexOf('.');
               // file1.zip
               // file2.zip
               return clientFileName.substring(i + 1);
           }
       }
       return null;
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
