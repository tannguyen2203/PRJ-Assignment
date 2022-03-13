/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.product;

/**
 *
 * @author ADMIN
 */
public class ProductError {
    private String productID;
    private String productName;
    private String image;
    

    public ProductError() {
        this.productID="";
        this.productName="";
        this.image="";
    }

    public ProductError(String productID, String productName, String image) {
        this.productID = productID;
        this.productName = productName;
        this.image = image;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
