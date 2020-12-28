package com.demo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customexception.CustomException;
import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class Controller {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "testemployee")
	public String testEmployee() {
		return "Working";
	}

	@PostMapping(value = "create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@DeleteMapping(value = "delete/{empId}")
	public void deleteEmployee(@PathVariable("empId") int empId) {
		employeeService.deleteEmployee(empId);
	}

	@GetMapping(value = "read/{empId}")
	public Employee readEmployee(@PathVariable("empId") int empId) {
		Employee employee = null;
		try {
			employee = employeeService.getEmployeeById(empId);
		} catch (CustomException e) {
			e.getMessage();
		}
		return employee;
	}

	@GetMapping(value = "readall")
	public List<Employee> readAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@PostMapping(value = "update/{empId}")
	public Employee updateEmployee(@PathVariable("empId") int empId, @RequestBody Employee employee) {
		Employee result = null;
		try {
			result = employeeService.updateEmployee(empId, employee);
		} catch (CustomException e) {
			e.printStackTrace();
		}
		return result;
	}
}
