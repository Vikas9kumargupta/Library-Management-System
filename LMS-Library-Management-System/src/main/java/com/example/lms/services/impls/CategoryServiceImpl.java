package com.example.lms.services.impls;

import com.example.lms.entities.Category;
import com.example.lms.exceptions.ResourceNotFoundException;
import com.example.lms.repositories.CategoryRepository;
import com.example.lms.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow(()->{
            return new ResourceNotFoundException("Category not found with id" +categoryId);
        });
    }

    @Override
    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(()->{
            return new ResourceNotFoundException("Category not found with id" +categoryId);
        });
        categoryRepository.delete(category);
    }
}
