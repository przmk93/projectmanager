package com.triplek.dao;

import java.util.List;

import com.triplek.domain.Task;

public interface DataDao {
	public int insertRow(Task task);  
	  
	 public List<Task> getList();  
	  
	 public Task getRowById(int id);  
	  
	 public int updateRow(Task task);  
	  
	 public int deleteRow(int id);  
}
