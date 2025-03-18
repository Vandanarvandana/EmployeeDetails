package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/postmap")
	public Employee createEmploee(@RequestBody Employee employee) {
		return service.createEmployee(employee);
	}

	@GetMapping("/fetch")
	public List<Employee> fetchEmployee(){
		return service.fetchEmployeee();
	}
	
	@GetMapping("/fetchid/{id}")
	public Employee fetchAllEmployeeid(@PathVariable int id) {
		return service.fetchAllEmployeeid(id);
	}
    
	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public String deteteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
}
