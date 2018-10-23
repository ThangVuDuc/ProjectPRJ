/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.CommentDAO;
import entity.Comment;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CommentBean {
     private int shopId;

    public CommentBean() {
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    
    public List<Comment> getComments() throws Exception{
        CommentDAO commentdao=new CommentDAO();
        List<Comment> comments=commentdao.select(shopId);
        return comments;
    }
}
