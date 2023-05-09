package com.assnigment.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assnigment.demo.Entity.Category;
import com.assnigment.demo.Entity.Product;
import com.assnigment.demo.Service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired(required = true)
    private CategoryService categoryService;

    //this method is for getting all the categories in the data base
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    //this method is for getting the category by id
    @GetMapping("/category/{categoryid}")
    public Category getCategoryById(@PathVariable int categoryid) {
        return categoryService.getCategoryById(categoryid);
    }

    //this method is for adding the category
    @PostMapping
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
    
    //this method is for updating the  category
    @PutMapping("/category/{categoryid}")
    public Category updateCategory(@PathVariable int categoryid, @RequestBody Category category) {
        return categoryService.updateCategory(categoryid, category);
    }

    //this method is for deleting the category
    @DeleteMapping("/category/{categoryid}")
    public void deleteCategory(@PathVariable int categoryid) {
        categoryService.deleteCategory(categoryid);
    }

    //this method is for getting the category with the product
    @GetMapping("/withProduct/{categoryid}")
    public List<Product> getProductsByCategoryId(@PathVariable int categoryid) {
        return categoryService.getProductsByCategoryId(categoryid);
    }
}

