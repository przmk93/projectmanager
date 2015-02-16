package com.triplek.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.triplek.domain.Task;

public class DataDaoImpl implements DataDao {
	 @Autowired  
	 SessionFactory sessionFactory;  
	
	@Override
	@Transactional  
	public int insertRow(Task task) {
		 Session session = sessionFactory.openSession();  
		  Transaction tx = session.beginTransaction();  
		  session.saveOrUpdate(task);  
		  tx.commit();  
		  Serializable id = session.getIdentifier(task);  
		  session.close();  
		  return (Integer) id;  
	}

	@Override
	public List<Task> getList() {
		  Session session = sessionFactory.openSession();  
		  @SuppressWarnings("unchecked")  
		  List<Task> taskList = session.createQuery("from Task")  
		    .list();  
		  session.close();  
		  return taskList;  
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
