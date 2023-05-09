package com.assnigment.demo.Service;

import java.util.List;

import com.assnigment.demo.Entity.Product;

public interface ProductService {

	List<Product> getAllProducts();

    Product getProductById(int productid);
    
    Product getProductByIdWithCategory(int productid);

    Product addProduct(Product product);

    Product updateProduct(int productid, Product product);

    void deleteProduct(int productid);
}
