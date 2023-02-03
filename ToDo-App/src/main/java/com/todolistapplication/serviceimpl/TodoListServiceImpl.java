package com.todolistapplication.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolistapplication.model.TodoList;
import com.todolistapplication.repository.TodoRepository;
import com.todolistapplication.service.TodoListService;

@Service
public class TodoListServiceImpl implements TodoListService{
	
	@Autowired
	private TodoRepository todoRepository;

	@Override
	public TodoList createTodoList(TodoList todoList) {
		return todoRepository.save(todoList);	
	}

	@Override
	public List<TodoList> getAllTodoLists(){
		return todoRepository.findAll();
	}
	@Override
	public TodoList updateTodoList(int id, TodoList todoList) {
		TodoList todo=todoRepository.findById(id).get();
		todo.setTodoTitle(todoList.getTodoTitle());
		todo.setTodoText(todoList.getTodoText());
		return todoRepository.save(todo);	
	}

	@Override
	public void deleteTodoList(int id) {
		todoRepository.deleteById(id);
	}
}
