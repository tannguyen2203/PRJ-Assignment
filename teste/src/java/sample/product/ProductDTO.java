/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.product;

import java.util.Locale;

/**
 *
 * @author ADMIN
 */
public class ProductDTO {
     private String productID;
    private String productName;
    private String image;
    private float price;
    private String categoryID;
    private String description;
    private String sizeID;

    public ProductDTO(String productID, String productName, String image, float price, String categoryID, String description, String sizeID) {
        this.productID = productID;
        this.productName = productName;
        this.image = image;
        this.price = price;
        this.categoryID = categoryID;
        this.description = description;
        this.sizeID = sizeID;
    }
     public ProductDTO() {
        productID = "";
        productName = "";
        image = "";
        price = 1;
        categoryID = "";
        description = "";
        sizeID = "";
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSizeID() {
        return sizeID;
    }

    public void setSizeID(String sizeID) {
        this.sizeID = sizeID;
    }

   
}
