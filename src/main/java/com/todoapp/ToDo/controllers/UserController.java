package com.todoapp.ToDo.controllers;


import com.todoapp.ToDo.model.User;
import com.todoapp.ToDo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {



    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/create")
    public  ResponseEntity<User> save( @RequestBody User user){
         User users = userService.save(user);
        return new ResponseEntity<>(users , HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody  User user){
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }


    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll(){
        List<User> allUsers = userService.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<User> findById(@PathVariable ("id") Long id){
        User findById = userService.findById(id);
        return new ResponseEntity<>(findById , HttpStatus.OK);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> delete(@PathVariable ("id") Long id){
        User deleteUser = userService.delete(id);
        return new ResponseEntity<>(deleteUser , HttpStatus.OK);
    }

}
