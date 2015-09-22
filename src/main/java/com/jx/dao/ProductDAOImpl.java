package com.jx.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.jx.pojo.Product;


@Repository("productDao")
public class ProductDAOImpl extends AbstractDAO implements ProductDAO{

	@Override
	public void saveProduct(Product product) {
		this.getSession().m
		persist(product);		
	}

	@Override
	public List<Product> findAllProducts() {
		Criteria criteria = getSession().createCriteria(Product.class);
		return (List<Product>) criteria.list();
	}

	@Override
	public void deleteProductByName(String name) {
		Query query = getSession().createSQLQuery("delete from PRODUCT where name = :name");
		query.setString(0, name);
		query.executeUpdate();
	}

	@Override
	public Product findProductByName(String name) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("name", name));
		return (Product)criteria.uniqueResult();
	}

	@Override
	public void updateProduct(Product product) {
		getSession().update(product);		
	}

}
