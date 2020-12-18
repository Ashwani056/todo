package com.example.demo.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.demo.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name = "todos")
public class ToDo {

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

	@OneToMany(mappedBy = "todo", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<SubTask> subTasks;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tag_id", nullable = true)
	private Tag tag;

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

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

	public Set<SubTask> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(Set<SubTask> subTasks) {
		this.subTasks = subTasks;
	}

}
