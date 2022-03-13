/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class ProductDAO {
//===============================PRODUCT===================================
    //get prodcut to show list
    public List<ProductDTO> getAllProduct() throws SQLException {
        List<ProductDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
           conn = DBUtils.getConnection();
           if(conn!=null){
               String sql = "select productID, productName, image, price, categoryID, description, sizeID from tblProduct";
               pstm = conn.prepareStatement(sql);
               rs = pstm.executeQuery();
               while (rs.next()) {                   
                   list.add(new ProductDTO(rs.getString("productID"), 
                       rs.getString("productName"), 
                       rs.getString("image"), 
                       rs.getFloat("price"),
                       rs.getString("categoryID"), 
                       rs.getString("description"),
                       rs.getString("sizeID")));
               }
           }
        } catch (Exception e) {
        }finally{
            if(conn!= null) conn.close();
            if(pstm!= null) pstm.close();
            if(rs!=null) rs.close();
        }
        return list;    
    }
    
    //lay detail san pham bang id
    public ProductDTO getProByID(String categoryID) throws SQLException {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
           conn = DBUtils.getConnection();
           if(conn!=null){
               String sql = "select productID, productName, image, price, categoryID, description, sizeID from tblProduct "
                       + "where productID = ?";
               pstm = conn.prepareStatement(sql);
               pstm.setString(1, categoryID);
               rs = pstm.executeQuery();
               while (rs.next()) {                   
                   return new ProductDTO(rs.getString("productID"), 
                       rs.getString("productName"), 
                       rs.getString("image"), 
                       rs.getFloat("price"),
                       rs.getString("categoryID"), 
                       rs.getString("description"),
                       rs.getString("sizeID"));
               }
           }
        } catch (Exception e) {
        }finally{
            if(conn!= null) conn.close();
            if(pstm!= null) pstm.close();
            if(rs!=null) rs.close();
        }   
        return null;
    }
    
    //Search product by name
    public List<ProductDTO> searchProduct(String seachPro) throws SQLException {
        List<ProductDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
           conn = DBUtils.getConnection();
           if(conn!=null){
               String sql = "select productID, productName, image, price, categoryID, description, sizeID from tblProduct "
                       + "where productName like ?";
               pstm = conn.prepareStatement(sql);
               pstm.setString(1, "%" +seachPro+ "%" );
               rs = pstm.executeQuery();
               while (rs.next()) {                   
                String productID = rs.getString("productID");
                    String productName = rs.getString("productName");
                    String image = rs.getString("image");
                    Float price = rs.getFloat("price");
                    String description = rs.getString("description");
                    String categoryID = rs.getString("categoryID");
                    String sizeID = rs.getString("sizeID");
                    list.add(new ProductDTO(productID, productName, image, price, categoryID, description, sizeID));
               }
           }
        } catch (Exception e) {
        }finally{
            if(conn!= null) conn.close();
            if(pstm!= null) pstm.close();
            if(rs!=null) rs.close();
        }   
        return list;
    }
    //delete item
    public boolean delete(String pid) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet resultSet = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "delete from tblProduct where productID = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, pid);
                check = pstm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception event) {

        } finally {
            if (pstm != null) {
                pstm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    //UPDATE ITEM
    public boolean Update(ProductDTO pro) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE tblProduct SET productName =?, image =?, price = ?, description=?, categoryID= ?, sizeID= ?"
                        + " WHERE productID =?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, pro.getProductName());
                pstm.setString(2, pro.getImage());
                pstm.setFloat(3, pro.getPrice());
                pstm.setString(4, pro.getDescription());
                pstm.setString(5, pro.getCategoryID());
                pstm.setString(6, pro.getSizeID());
                pstm.setString(7, pro.getProductID());
                
                check = pstm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception event) {
            event.printStackTrace();
        } finally {
            if (pstm != null) {
                pstm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    //check trung id san pham
    public ProductDTO getProInfor(String productID) throws SQLException {
        ProductDTO product = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "select productID, productName, image, price, categoryID, description, sizeID from tblProduct "
                        + "WHERE productID= ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, productID);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    String productName = rs.getString("productName");
                    String image = rs.getString("image");
                    Float price = rs.getFloat("price");
                    String description = rs.getString("description");
                    String categoryID = rs.getString("categoryID");
                    String sizeID = rs.getString("sizeID");
                    product = new ProductDTO(productID, productName, image, 0, categoryID, description, sizeID);
                }
            }
        } catch (Exception event) {
            event.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return product;
    }
    
    
//============================CATEGORY=========================    
    public List<CategoryDTO> getCategory() throws SQLException{
        List<CategoryDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
           conn = DBUtils.getConnection();
           if(conn!=null){
               String sql = "select categoryID, CategoryName from tblCategory";
               pstm = conn.prepareStatement(sql);
               rs = pstm.executeQuery();
               while (rs.next()) {                   
                   list.add(new CategoryDTO(rs.getInt("categoryID"),
                           rs.getNString("CategoryName")));
               }
           }
        } catch (Exception e) {
        }finally{
            if(conn!= null) conn.close();
            if(pstm!= null) pstm.close();
            if(rs!=null) rs.close();
        }
        return list;    
    } 
    
   //lam category
    public List<ProductDTO> getProByCID(String categoryID) throws SQLException {
        //List<ProductDTO> list = null;
        List<ProductDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
           conn = DBUtils.getConnection();
           if(conn!=null){
               //list = new ArrayList<>();
               String sql = "select productID, productName, image, price, categoryID, description, sizeID from tblProduct "
                       + "where categoryID = ?";
               pstm = conn.prepareStatement(sql);
               pstm.setString(1, categoryID);
               rs = pstm.executeQuery();
               while (rs.next()) {                   
                   list.add(new ProductDTO(rs.getString("productID"), 
                       rs.getString("productName"), 
                       rs.getString("image"), 
                       rs.getFloat("price"),
                       rs.getString("categoryID"), 
                       rs.getString("description"),
                       rs.getString("sizeID")));
               }
           }
        } catch (Exception e) {
        }finally{
            if(conn!= null) conn.close();
            if(pstm!= null) pstm.close();
            if(rs!=null) rs.close();
        }
        return list;    
    }
    
    public boolean insertProduct(ProductDTO pro) throws SQLException{
        boolean check = false;
        Connection conn=null;
        PreparedStatement stm=null;
        try {
            conn=DBUtils.getConnection();
            if(conn!=null){
                String sql= " INSERT INTO tblProduct(productID, productName, image, price, categoryID, description, sizeID) "
                        + " VALUES(?,?,?,?,?,?,?) ";
                stm=conn.prepareStatement(sql);
                stm.setString(1, pro.getProductID());
                stm.setString(2, pro.getProductName());
                stm.setString(3, pro.getImage());
                stm.setFloat(4, pro.getPrice());
                stm.setString(5, pro.getCategoryID());
                stm.setString(6, pro.getDescription());
                stm.setString(7, pro.getSizeID());
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
