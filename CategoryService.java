package com.assnigment.demo.Service;

import java.util.List;

import com.assnigment.demo.Entity.Category;
import com.assnigment.demo.Entity.Product;

public interface CategoryService {

	List<Category> getAllCategories();

    Category getCategoryById(int categoryid);

    Category addCategory(Category category);

    Category updateCategory(int categoryid, Category category);

    void deleteCategory(int categoryid);

    List<Product> getProductsByCategoryId(int categoryid);
    
}
