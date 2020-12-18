package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.repository.ToDoRepo;

@RestController
public class ToDoController {

	@Autowired
	private ToDoRepo toDoRepo;

	@PostMapping("/todos")
	ToDo newToDo(@RequestBody ToDo newToDo) {

		ToDo updatedTodo = null;
		if (newToDo != null) {
			updatedTodo = toDoRepo.save(newToDo);
		}
		// handling
		return updatedTodo;

	}

}
