package com.triplek.services;

import com.triplek.domain.Task;
import java.util.List;
public interface DataService {
	public int insertRow(Task task);  
	  
	 public List<Task> getList();  
	  
	 public Task getRowById(int id);  
	  
	 public int updateRow(Task task);  
	  
	 public int deleteRow(int id);  
}
