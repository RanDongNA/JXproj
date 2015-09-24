package com.jx.services;

import java.util.List;

import com.jx.pojo.Image;
import com.jx.pojo.Product;

public interface ImageService {
	
	void saveImage(Image image);
	
	List<Image> findAllImages();
	
	List<Image> findImageByProduct(Product product);
	
	void deleteImagesByProduct(Product product);
	
	void updateImages(Image image);
}
