package com.todolistapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoList {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int todoId;
	private String todoTitle;
	private String todoText;
	
	public TodoList() {
		super();
	}
	
	public TodoList(int todoId, String todoTitle, String todoText) {
		super();
		this.todoId = todoId;
		this.todoTitle = todoTitle;
		this.todoText = todoText;
	}
	public int getTodoId() {
		return todoId;
	}
	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}
	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoText() {
		return todoText;
	}
	public void setTodoText(String todoText) {
		this.todoText = todoText;
	}
	@Override
	public String toString() {
		return "TodoList [todoId=" + todoId + ", todoTitle=" + todoTitle + ", todoText=" + todoText + "]";
	}
}
