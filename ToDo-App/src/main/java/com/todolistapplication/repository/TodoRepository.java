package com.todolistapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolistapplication.model.TodoList;


public interface TodoRepository extends JpaRepository<TodoList, Integer>{

}
