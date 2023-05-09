package com.assnigment.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assnigment.demo.Entity.Product;
import com.assnigment.demo.Repo.ProductRepo;
import com.assnigment.demo.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired(required=true)
	private ProductService productService ;
	
	//this method is for getting all products in the data base
	@GetMapping("/productt")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

	//this method is for getting a single product by id
    @GetMapping("productt/{productid}")
    public Product getProductById(@PathVariable int productid) {
        return productService.getProductById(productid);
    }

    //this method is for inserting the product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    //this method is for updating the product
    @PutMapping("/productt/{productid}")
    public Product updateProduct(@PathVariable int productid, @RequestBody Product product) {
        return productService.updateProduct(productid, product);
    }
    
	//this  method is for deleting the product
    @DeleteMapping("/productt/{productid}")
    public void deleteCategory(@PathVariable int productid) {
        productService.deleteProduct(productid);
    }
	
    //this method is for getting the product with the category
	@GetMapping("/withCategory/{productid}")
    public Product getProductByIdWithCategory(@PathVariable int productid) {
        return productService.getProductByIdWithCategory(productid);
}
	
}