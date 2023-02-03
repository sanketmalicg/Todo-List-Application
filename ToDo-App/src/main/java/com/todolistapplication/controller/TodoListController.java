package com.todolistapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.todolistapplication.model.TodoList;
import com.todolistapplication.service.TodoListService;
import com.todolistapplication.serviceimpl.TodoListServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/todo")
//@CrossOrigin(origins = "*")
public class TodoListController {
	
	@Autowired
	private TodoListService todoListService;
	
	@GetMapping("/getAllTodoList")
	public List<TodoList> getAllTodoList(){
		return this.todoListService.getAllTodoLists();
	}
	
	@PostMapping("/addTodoList")
	public TodoList createTodoEntity(TodoList todoList) {
		return this.todoListService.createTodoList(todoList);
	}
	
	@PutMapping("/updateTodoList/{id}")
	public TodoList updateTodoList(int id,TodoList todoList) {
		return this.todoListService.updateTodoList(id, todoList);
	}

	@DeleteMapping("/deleteTodoList/{id}")
	public String deleteTodoList(int id) {
		this.todoListService.deleteTodoList(id); 
		return "Todo deleted successfully with id: "+id;
	}
}