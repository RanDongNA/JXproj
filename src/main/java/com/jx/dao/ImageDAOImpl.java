package com.jx.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jx.pojo.Image;
import com.jx.pojo.Product;

@Repository("imageDaoImpl")
public class ImageDAOImpl extends AbstractDAO implements ImageDAO{

	@Override
	public void saveImage(Image image) {
		getSession().save(image);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Image> findAllImages() {
		Criteria criteria = getSession().createCriteria(Image.class);
		return (List<Image>)criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Image> findImageByProduct(Product product) {
		int pid = product.getId();
		Criteria criteria = getSession().createCriteria(Image.class);
		criteria.add(Restrictions.eq("product_id", pid));
		return (List<Image>)criteria.list();
	}

	@Override
	public void deleteImagesByProduct(Product product) {
		int pid = product.getId();
		Query query = getSession().createSQLQuery("delete from IMAGE where product_id = :pid");
		query.setString("pid", ""+pid);
		query.executeUpdate();
	}

	@Override
	public void updateImages(Image image) {
		getSession().update(image);
	}
	
}
