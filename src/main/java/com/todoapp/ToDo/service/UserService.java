package com.todoapp.ToDo.service;

import com.todoapp.ToDo.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    User updateUser(User user);
    List<User> findAll();
    User findById(Long id);
    User delete(Long id);

}
