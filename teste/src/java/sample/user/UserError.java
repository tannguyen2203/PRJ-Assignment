/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.user;

/**
 *
 * @author ADMIN
 */
public class UserError {
    private String userID;
    private String errorName;
    private String address;
    private String phone;
    private String password;
    private String confirm;

    public UserError() {
        this.userID="";
        this.errorName="";
        this.address="";
        this.phone="";
        this.password="";
        this.confirm="";
    }

    public UserError(String userID, String errorName, String address, String phone, String password, String confirm) {
        this.userID = userID;
        this.errorName = errorName;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.confirm = confirm;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    
}
