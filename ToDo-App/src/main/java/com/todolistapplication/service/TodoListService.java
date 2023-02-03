package com.todolistapplication.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.todolistapplication.model.TodoList;

@Component
public interface TodoListService {
	
	public List<TodoList> getAllTodoLists();
	
	public TodoList createTodoList(TodoList todoList);
	
	public TodoList updateTodoList(int id,TodoList todoList);

	public void deleteTodoList(int id);	
}
