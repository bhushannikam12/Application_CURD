package com.assnigment.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assnigment.demo.Entity.Category;

public interface CategoryRepo extends JpaRepository <Category, Integer> {

} 


