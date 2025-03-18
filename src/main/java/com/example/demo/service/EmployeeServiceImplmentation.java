package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.Employeerepo;

@Service
public class EmployeeServiceImplmentation implements EmployeeService {
	
	@Autowired
	Employeerepo employeerep;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub;
		return employeerep.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeee() {
		// TODO Auto-generated method stub
		return employeerep.findAll();
	}

	@Override
	public Employee fetchAllEmployeeid(int id) {
		// TODO Auto-generated method stub
		return employeerep.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerep.save(employee);
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeerep.deleteAll();
		return "DELETION IS SUCCESSFULL";
	}

}
