package com.jx.dao;

import java.util.List;

import com.jx.pojo.Product;

public interface ProductDAO {
	void saveProduct(Product product);
    
    List<Product> findAllProducts();
     
    void deleteProductByName(String name);
     
    Product findProductByName(String name);
     
    void updateProduct(Product product);
}
