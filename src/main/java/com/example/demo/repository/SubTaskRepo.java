package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SubTask;


@Repository
public interface SubTaskRepo extends JpaRepository<SubTask, Long> {
	
	List<SubTask> findAll();
}