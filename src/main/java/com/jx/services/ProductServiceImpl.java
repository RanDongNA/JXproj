package com.jx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jx.dao.ProductDAO;
import com.jx.pojo.Product;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO productDAO;
	
	
	@Override
	public void saveProduct(Product product) {
		productDAO.saveProduct(product);
	}

	@Override
	public List<Product> findAllProducts() {
		return productDAO.findAllProducts();
	}

	@Override
	public void deleteProductsByName(String name) {
		productDAO.deleteProductsByName(name);	
	}
	public void deleteProductById(int id) {
		productDAO.deleteProductById(id);
	}

	@Override
	public List<Product> findProductsByName(String name) {
		return productDAO.findProductsByName(name);
	}
	
	@Override
	public Product findProductById(int id) {
		return productDAO.findProductById(id);
	}

	@Override
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);		
	}

}
