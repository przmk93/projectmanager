package com.triplek.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class Task implements Serializable {

	private static final long serialVersionUID = 1L;

	public Task() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String commentary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String param) {
		this.commentary = param;
	}

}