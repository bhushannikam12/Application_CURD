package com.assnigment.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assnigment.demo.Entity.Category;
import com.assnigment.demo.Entity.Product;
import com.assnigment.demo.Repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService
{
	
    @Autowired
	private CategoryRepo categoryRepo;

	@Override
	public List<Category> getAllCategories() {
		return categoryRepo.findAll();
	}

	@Override
	public Category getCategoryById(int categoryid) {
		 return categoryRepo.findById(categoryid).orElse(null);
	}

	@Override
	public Category addCategory(Category category) {
		 return categoryRepo.save(category);
	}

	@Override
	public Category updateCategory(int categoryid, Category category) {
		Category existingCategory = categoryRepo.findById(categoryid).orElse(null);
        if (existingCategory != null) {
            existingCategory.setElectronics(category.getElectronics());
            return categoryRepo.save(existingCategory);
        }
        return null;
	}

	@Override
	public void deleteCategory(int categoryid) {
		categoryRepo.deleteById(categoryid);
		
	}

	@Override
	public List<Product> getProductsByCategoryId(int categoryid) {
		// TODO Auto-generated method stub
		return null;
	}
	
    
}