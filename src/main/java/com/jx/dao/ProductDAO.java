package com.jx.dao;

import java.util.List;

import com.jx.pojo.Product;

public interface ProductDAO {
	void saveProduct(Product product);
    
    List<Product> findAllProducts();
     
    void deleteProductsByName(String name);
    void deleteProductById(int id);
    
     
    List<Product> findProductsByName(String name);
    
    Product findProductById(int id); 
    
    void updateProduct(Product product);
}
