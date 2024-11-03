package com.todoapp.ToDo.service.impl;


import com.todoapp.ToDo.exception.UserNotFoundException;
import com.todoapp.ToDo.model.ToDo;
import com.todoapp.ToDo.repository.TodoRepositroy;
import com.todoapp.ToDo.service.ToDoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private TodoRepositroy todoRepositroy;

    @Override
    public ToDo save(ToDo todo){
        return todoRepositroy.save(todo);
    }

    @Override
    public ToDo update(ToDo todo){
        return todoRepositroy.save(todo);
    }

    @Override
    public List<ToDo> findAll(){
        return  todoRepositroy.findAll();
    }

    @Override
    public ToDo findById(Long id){
        return todoRepositroy.findById(id).orElseThrow(()-> new UserNotFoundException("User " +id+ "not found"));
    }

    @Override
    public void deleteById(Long id){
        todoRepositroy.deleteById(id);
    }
}
