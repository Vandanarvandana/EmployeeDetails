package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;


public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	public List<Employee> fetchEmployeee();
	public Employee fetchAllEmployeeid(int id);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(int id);

}
