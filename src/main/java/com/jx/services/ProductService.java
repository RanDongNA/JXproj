package com.jx.services;

import java.util.List;

import com.jx.pojo.Product;

public interface ProductService {
	void saveProduct(Product product);
    
    List<Product> findAllProducts();
     
    void deleteProductByName(String name);
     
    Product findProductByName(String name);
     
    void updateProduct(Product product);
}
