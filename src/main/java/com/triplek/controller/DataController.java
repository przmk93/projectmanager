package com.triplek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.triplek.domain.Task;
import com.triplek.services.DataService;

@Controller
public class DataController {

	@Autowired  
	 DataService dataService;  
	  
	 @RequestMapping("form")  
	 public ModelAndView getForm(@ModelAttribute Task task) {  
	  return new ModelAndView("form");  
	 }  
	  
	 @RequestMapping("register")  
	 public ModelAndView registerUser(@ModelAttribute Task task) {  
	  dataService.insertRow(task);  
	  return new ModelAndView("redirect:list");  
	 }  
	  
	 @RequestMapping("list")  
	 public ModelAndView getList() {  
	  List<Task> taskList = dataService.getList();  
	  return new ModelAndView("list", "taskList", taskList);  
	 }  
}
