package com.todoapp.ToDo.service.impl;


import com.todoapp.ToDo.exception.UserNotFoundException;
import com.todoapp.ToDo.model.User;
import com.todoapp.ToDo.repository.UserRepository;
import com.todoapp.ToDo.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
       return userRepository.save(user);
    }

    @Override
    public User updateUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(()->
                new UserNotFoundException("User " + id + "not found"));
    }

    @Override
    public User delete(Long Id) {
        userRepository.deleteById(Id);

        return null;
    }


}
