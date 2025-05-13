package com.tekpyramid.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tekpyramid.mvc.dao.StudentDao;
import com.tekpyramid.mvc.entity.Student;

@Controller
public class AppController{
	
	@Autowired
	private StudentDao studentDao;
	
	
	
	@RequestMapping("/")
	public String firstPage() {
		
		return "index";		
	}
	
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(@RequestParam int num1, @RequestParam int num2) {
	   
	    return  "<h1> The sum is "+(num1 + num2)+"</h1>"; // Will return as plain text
	}
	
	@GetMapping("/signup")
	public String signup() {
		
		return "signup";
		
	}
	
	@PostMapping("/signup")
	@ResponseBody
	public String signup(Student student) {
		
		studentDao.save(student);
		
		return "<h1>Signup successfull</h1>";
		
	}
	

}

