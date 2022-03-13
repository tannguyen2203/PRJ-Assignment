/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.order;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class OrderDTO {
    private String orderID;
    private String userID;
    private Date date;
    private float total;

    public OrderDTO() {
    }

    public OrderDTO(String orderID, String userID, Date date, float total) {
        this.orderID = orderID;
        this.userID = userID;
        this.date = date;
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDTO{" + "orderID=" + orderID + ", userID=" + userID + ", date=" + date + ", total=" + total + '}';
    }
    
}
