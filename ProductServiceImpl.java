package com.assnigment.demo.Service;

import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assnigment.demo.Entity.Product;
import com.assnigment.demo.Repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
    private ProductRepo productRepo;

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(int productid) {
		return productRepo.findById(productid).orElse(null);
	}

	@Override
	public Product getProductByIdWithCategory(int productid) {
		// TODO Auto-generated method stub
	        return productRepo.findById(productid).map(product -> {
	            Hibernate.initialize(product.getCategory());
	            return product;
	        }).orElse(null);
	    }
	
	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(int productid, Product product) {
		Product existingProduct = productRepo.findById(productid).orElse(null);
        if (existingProduct != null) {
            existingProduct.setProduct(product.getProduct());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            return productRepo.save(existingProduct);
        } else {
            return null;
        }
	}

	@Override
	public void deleteProduct(int productid) {
		productRepo.deleteById(productid);
		
	}

	
}
