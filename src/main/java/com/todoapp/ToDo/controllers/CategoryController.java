package com.todoapp.ToDo.controllers;

import com.todoapp.ToDo.model.Category;
import com.todoapp.ToDo.service.CategoryService;
import com.todoapp.ToDo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService , ToDoService toDoService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/add")
    public ResponseEntity<Category> save(@RequestBody Category category){
        Category categories = categoryService.save(category);
        return new ResponseEntity<>(categories, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category){
        Category update = categoryService.updateCategory(category);
        return new ResponseEntity<>(update ,HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Category>> findAll(){
        List<Category> findAllCategory = categoryService.findAll();
        return new ResponseEntity<>(findAllCategory , HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id ){
         Category findById = categoryService.findById(id);
        return new ResponseEntity<>(findById , HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<Category> deleteCategory(@PathVariable ("id") Long id){
       categoryService.deleteCategory(id);
       return new ResponseEntity<>( HttpStatus.OK);
    }


}
