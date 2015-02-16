package com.triplek.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "Project")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	public Project() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String description;
	private String state;
	@OneToMany
	private Collection<Task> task;
	@ManyToMany(mappedBy = "project")
	private Collection<User> user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String param) {
		this.description = param;
	}

	public String getState() {
		return state;
	}

	public void setState(String param) {
		this.state = param;
	}

	public Collection<Task> getTask() {
		return task;
	}

	public void setTask(Collection<Task> param) {
		this.task = param;
	}

	public Collection<User> getUser() {
		return user;
	}

	public void setUser(Collection<User> param) {
		this.user = param;
	}

}