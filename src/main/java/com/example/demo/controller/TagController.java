package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tag;
import com.example.demo.repository.TagRepo;

@RestController
public class TagController {

	@Autowired
	TagRepo tagRepo;

	@PostMapping("/todos/tags")
	Tag newToDo(@RequestBody Tag tag) {

		Tag newtag = null;
		if (tag != null) {
			newtag = tagRepo.save(tag);
		}
		// handling
		return newtag;

	}

	@GetMapping("/todos/tags")
	List<Tag> getAllTag() {
		return tagRepo.findAll();

	}

}
