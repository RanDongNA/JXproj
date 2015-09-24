package com.jx.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jx.pojo.Product;
import com.jx.services.ProductService;

@Component
@Path("/product/")
public class ProductCRUDController {
	
	@Autowired
	ProductService productService;	
	
	@GET
	@Path("/getByName")
	@Produces("application/json")
	public List<Product> getProductsByName(
			@QueryParam("name") String name) {
		return productService.findProductsByName(name);
	}
	
	@GET
	@Path("/getById")
	@Produces("application/json")
	public Product getProudctById(
			@QueryParam("id") int id) {
		return productService.findProductById(id);
	}
	
	
	@PUT
	//@Consumes("application/json")
	@Path("/createProduct")
	public void createProduct(
			@FormParam("productName") String name,
			@FormParam("productDescription") String description,
			@FormParam("parentProductId") int parentProductId) {
		System.out.println(name+" "+description+" "+parentProductId);
		Product parentProduct = productService.findProductById(parentProductId);
		Product newProduct = new Product();
		newProduct.setName(name);
		newProduct.setDescription(description);
		newProduct.setParentProduct(parentProduct);
		productService.saveProduct(newProduct);
	}
	
	@POST
	@Path("/createOrUpdateProduct")
	public void createOrUpdateProduct(
			
			@FormParam("productId") int id,
			@FormParam("productName") String name,
			@FormParam("productDescription") String description,
			@FormParam("parentProductId") int parentProductId) {
		
		Product parentProduct = productService.findProductById(parentProductId);
		Product thisProduct = productService.findProductById(id);
		if(thisProduct==null) 
			thisProduct = new Product();
		thisProduct.setName(name);
		thisProduct.setDescription(description);
		thisProduct.setParentProduct(parentProduct);
		productService.saveProduct(thisProduct);		
	}
	

	@DELETE
	@Path("/deleteProduct/byName")
	public void deleteProduct(
			@QueryParam("productName") String name) {
		productService.deleteProductsByName(name);
	}
	
	@DELETE
	@Path("/deleteProduct/byId")
	public void deleteProduct(
			@QueryParam("productId") int id) {
		System.out.println(""+id);
		productService.deleteProductById(id);
	}
}
