package com.todoapp.ToDo.service;


import com.todoapp.ToDo.model.ToDo;

import java.util.List;

public interface ToDoService {

    ToDo save(ToDo todo);
    ToDo update(ToDo todo);
    List<ToDo> findAll();
    ToDo findById(Long id);
    void deleteById(Long id);
}
