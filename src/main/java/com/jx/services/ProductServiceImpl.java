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
	public void deleteProductByName(String name) {
		productDAO.deleteProductByName(name);	
	}

	@Override
	public Product findProductByName(String name) {
		return productDAO.findProductByName(name);
	}

	@Override
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);		
	}

}
