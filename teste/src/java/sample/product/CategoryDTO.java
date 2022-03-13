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
public class CategoryDTO {
    private int categoryID;
    private String cName;

    public CategoryDTO() {
    }

    public CategoryDTO(int categoryID, String cName) {
        this.categoryID = categoryID;
        this.cName = cName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" + "categoryID=" + categoryID + ", cName=" + cName + '}';
    }
    
}
