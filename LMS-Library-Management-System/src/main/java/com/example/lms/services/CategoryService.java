package com.example.lms.services;

import com.example.lms.entities.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAllCategories();
    Category findCategoryById(Long CategoryId);
    void createCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(Long categoryId);

}
