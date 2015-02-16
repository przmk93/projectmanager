package com.triplek.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.OneToMany;

import java.util.List;

@Entity
@Table(name = "Admin")
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;

	public Admin() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String login;
	private String password;
	@OneToMany
	private Collection<User> user;
	@OneToMany
	private List<Project> project;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String param) {
		this.login = param;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String param) {
		this.password = param;
	}

	public Collection<User> getUser() {
		return user;
	}

	public void setUser(Collection<User> param) {
		this.user = param;
	}

	public List<Project> getProject() {
	    return project;
	}

	public void setProject(List<Project> param) {
	    this.project = param;
	}

}