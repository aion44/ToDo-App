package com.todoapp.ToDo.controllers;

import com.todoapp.ToDo.model.ToDo;
import com.todoapp.ToDo.service.CategoryService;
import com.todoapp.ToDo.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/todo")
public class ToDoController {


    @Autowired
    private final ToDoService toDoService;

    public ToDoController(CategoryService categoryService, ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @PostMapping("/save")
    public ResponseEntity<ToDo> save(@RequestBody ToDo toDo){
        ToDo saveToDo = toDoService.save(toDo);
        return new ResponseEntity<>(saveToDo , HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ToDo> update(@RequestBody ToDo toDo){
        ToDo updateToDo = toDoService.save(toDo);
        return new ResponseEntity<>(updateToDo , HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ToDo>> findAll(){
        List<ToDo> findAllToDo = toDoService.findAll();
        return new ResponseEntity<>(findAllToDo ,HttpStatus.OK);
    }

    @GetMapping ("/findById/{id}")
    public ResponseEntity<ToDo> findById(@PathVariable Long id){
        ToDo findByIdToDo = toDoService.findById(id);
        return new ResponseEntity<>(findByIdToDo , HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ToDo> delete(@PathVariable Long id){
        toDoService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
