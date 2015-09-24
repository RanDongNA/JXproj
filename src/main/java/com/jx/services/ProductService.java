package com.jx.services;

import java.util.List;

import com.jx.pojo.Product;

public interface ProductService {
	void saveProduct(Product product);
    
    List<Product> findAllProducts();
     
    void deleteProductsByName(String name);
    void deleteProductById(int id);
     
    List<Product> findProductsByName(String name);
    
    Product findProductById(int id);
     
    void updateProduct(Product product);
}
