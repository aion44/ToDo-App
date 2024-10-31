package com.todoapp.ToDo.service.impl;

import com.todoapp.ToDo.exception.UserNotFoundException;
import com.todoapp.ToDo.model.Category;
import com.todoapp.ToDo.repository.CategoryRepository;
import com.todoapp.ToDo.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private  CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category){
       return  categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }


    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElseThrow(()->
                new UserNotFoundException("User " + id + "not found"));
    }


    @Override
    public void deleteCategory(Long id) {
          categoryRepository.deleteById(id);
    }

}