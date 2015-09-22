package com.jx.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jx.pojo.Product;
import com.jx.pojo.TestPojo;
import com.jx.services.PojoService;
import com.jx.services.ProductService;

@Component
@Path("/")
public class MyTestController {
	
	@Autowired
	PojoService service;
	
	@Autowired
	ProductService productService;
	
    @GET
    @Path("/test")
    @Produces("application/json")
    public List<TestPojo> testRest() {
    	System.out.println(" ~ rest service called ~ ");
    	
    	List<TestPojo> list = service.findAllPojos();
    	//TestPojo p = new TestPojo("RD",24);
    	//service.savePojo(p);
    	
        return list;
    }
    
    @GET
	@Path("/mkyong")
	public Response savePayment() {

		String result = "TEST String";

		return Response.status(200).entity(result).build();

	}
    
    @GET
    @Path("/init")
    public void init() {
    	System.out.println(" ~ init service called ~ ");
    	
    	Product p1 = new Product();
    	p1.setName("a");
    	p1.setDescription("this is a");
    	
    	Product p2 = new Product();
    	p2.setName("b");
    	p2.setDescription("this is b, child of a");
    	p2.setParentProduct(p1);
    	
    	Product p3 = new Product();
    	p3.setName("c");
    	p3.setDescription("this is c, 2nd child of a");
    	p3.setParentProduct(p1);
    	
    	//System.out.println(" save p1 ");
    	//productService.saveProduct(p1);
    	System.out.println(" save p2 ");
    	productService.saveProduct(p2);
    	productService.saveProduct(p3);
    }
}