package com.jx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jx.dao.ImageDAO;
import com.jx.pojo.Image;
import com.jx.pojo.Product;

@Transactional
@Service("imageService")
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	ImageDAO imageDAO;
	
	@Override
	public void saveImage(Image image) {
		imageDAO.saveImage(image);
	}

	@Override
	public List<Image> findAllImages() {
		return imageDAO.findAllImages();
	}

	@Override
	public List<Image> findImageByProduct(Product product) {
		return imageDAO.findImageByProduct(product);
	}

	@Override
	public void deleteImagesByProduct(Product product) {
		imageDAO.deleteImagesByProduct(product);		
	}

	@Override
	public void updateImages(Image image) {
		imageDAO.updateImages(image);		
	}

}
