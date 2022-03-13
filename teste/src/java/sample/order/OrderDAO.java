/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.order;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sample.product.ProductDTO;
import sample.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class OrderDAO {
     public boolean insertOrder(OrderDTO order) throws SQLException{
        boolean check = false;
        Connection conn=null;
        PreparedStatement stm=null;
        try {
            conn=DBUtils.getConnection();
            if(conn!=null){
                String sql= " INSERT INTO order(orderID, userID, date, total"
                        + " VALUES(?,?,?,?) ";
                stm=conn.prepareStatement(sql);
                stm.setString(1, order.getOrderID());
                stm.setString(2, order.getUserID());
                stm.setDate(3, (Date) order.getDate());
                stm.setFloat(4, order.getTotal());
                
                check=stm.executeUpdate()> 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(stm!=null) stm.close();
            if(conn!=null) conn.close();
        }
        return check;
    }
     
      public boolean insertOrderDetail(OrderDetailDTO orderDetail) throws SQLException{
        boolean check = false;
        Connection conn=null;
        PreparedStatement stm=null;
        try {
            conn=DBUtils.getConnection();
            if(conn!=null){
                String sql= " INSERT INTO product(detailID, orderID, productID, price, quantity) "
                        + " VALUES(?,?,?,?,?) ";
                stm=conn.prepareStatement(sql);
                stm.setString(1, orderDetail.getDetailID());
                stm.setString(2, orderDetail.getOrderID());
                stm.setString(3, orderDetail.getProductID());
                stm.setFloat(4, orderDetail.getPrice());
                stm.setInt(5, orderDetail.getQuantity());
                check=stm.executeUpdate()> 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(stm!=null) stm.close();
            if(conn!=null) conn.close();
        }
        return check;
    }
}
