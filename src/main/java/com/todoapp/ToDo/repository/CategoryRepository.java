package com.todoapp.ToDo.repository;

import com.todoapp.ToDo.model.Category;
import com.todoapp.ToDo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
