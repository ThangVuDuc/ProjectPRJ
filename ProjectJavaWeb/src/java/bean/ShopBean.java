/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import Context.DBContext;
import dao.ShopDAO;
import entity.Shop;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ShopBean {

    private int page, pageSize,shopId;

    public ShopBean() {
        this.page = 1;
        this.pageSize = 6;
    }

    public int getPages() throws Exception {
        int n = new ShopDAO().select().size();
        return (int) Math.ceil((double) n / pageSize);
//        int m=n/pageSize;
//        return (m==0?1:m);
    }

    public List<Shop> getShops() throws Exception {
        int from = (page - 1) * pageSize + 1;
        int to = page * pageSize;
        String store = "{call GetShops(?,?)}";
        Connection conn = new DBContext().getConnection();
        CallableStatement cs = conn.prepareCall(store);
        cs.setInt(1, from);
        cs.setInt(2, to);
        ResultSet rs = cs.executeQuery();
        List<Shop> shops = new ArrayList<>();
        while (rs.next()) {
            int shopid = rs.getInt("shopid");
            int userid = rs.getInt("userid");
            String title = rs.getString("title");
            String description = rs.getString("description");
            boolean openOrClose = rs.getBoolean("openOrClose");
            shops.add(new Shop(shopid, userid, title, description, openOrClose));
        }
        rs.close();
        conn.close();
        return shops;
    }

    public Shop getShopById() throws Exception {
        ShopDAO shopdao=new ShopDAO();
        return shopdao.selectById(shopId);
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
