package com.jx.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jx.pojo.Product;

@Repository("productDao")
public class ProductDAOImpl extends AbstractDAO implements ProductDAO{
	
	
	@Override
	public void saveProduct(Product product) {
		getSession().save(product);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findAllProducts() {
		Criteria criteria = getSession().createCriteria(Product.class);
		return (List<Product>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteProductsByName(String name) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("productName", name));
		List<Product> d = (List<Product>) criteria.list();
		if(d!=null)
			for(Product dp: d)
				delete(dp);
	}
	
	public void deleteProductById(int id) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("id", id));
		Product d = (Product) criteria.uniqueResult();
		if(d!=null)
			delete(d);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findProductsByName(String name) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("name", name));
		return (List<Product>)criteria.list();
	}

	@Override
	public void updateProduct(Product product) {
		getSession().update(product);		
	}

	@Override
	public Product findProductById(int id) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("id", id));
		return (Product)criteria.uniqueResult();
	}


}
