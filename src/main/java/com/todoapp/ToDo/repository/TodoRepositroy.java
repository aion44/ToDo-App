package com.todoapp.ToDo.repository;

import com.todoapp.ToDo.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositroy extends JpaRepository<ToDo, Long> {
}
