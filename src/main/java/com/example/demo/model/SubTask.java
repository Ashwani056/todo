package com.example.demo.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.tomcat.jni.Address;

import com.example.demo.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "subtasks")
public class SubTask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String description;

	@Enumerated(EnumType.ORDINAL)
	private Status status;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dueDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date complitionDate;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "todo_id", nullable = true)
	private ToDo todo;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getComplitionDate() {
		return complitionDate;
	}

	public void setComplitionDate(Date complitionDate) {
		this.complitionDate = complitionDate;
	}

	public ToDo getTodo() {
		return todo;
	}

	public void setTodo(ToDo todo) {
		this.todo = todo;
	}

}
