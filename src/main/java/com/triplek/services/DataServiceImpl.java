package com.triplek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.triplek.dao.DataDao;
import com.triplek.domain.Task;

public class DataServiceImpl implements DataService {

	 @Autowired  
	 DataDao dataDao;  
	
	@Override
	public int insertRow(Task task) {
		// TODO Auto-generated method stub
		 return dataDao.insertRow(task);  
	}

	@Override
	public List<Task> getList() {
		// TODO Auto-generated method stub
		return dataDao.getList();  
	}

	@Override
	public Task getRowById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateRow(Task task) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRow(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
