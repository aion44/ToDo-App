package com.todoapp.ToDo.service;

import com.todoapp.ToDo.model.Category;

import java.util.List;

public interface CategoryService {
    Category save (Category category);
    Category updateCategory(Category category);
    List<Category> findAll();
    Category findById(Long id);
    void deleteCategory(Long id);


}
