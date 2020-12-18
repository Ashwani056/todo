package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SubTask;
import com.example.demo.model.Tag;
import com.example.demo.model.ToDo;
import com.example.demo.repository.SubTaskRepo;
import com.example.demo.repository.ToDoRepo;

@RestController
public class SubTaskController {

	@Autowired
	private SubTaskRepo subTaskRepo;

	@PostMapping("/todos/subtask")
	SubTask newToDo(@RequestBody SubTask subTask) {

		SubTask task = null;
		if (subTask != null) {
			task = subTaskRepo.save(subTask);
		}
		// handling
		return task;

	}

	@GetMapping("/todos/subtask")
	List<SubTask> getAllTag() {
		return subTaskRepo.findAll();

	}

}
