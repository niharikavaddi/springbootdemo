package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.customexception.CustomException;
import com.demo.dao.EmployeeRepository;
import com.demo.model.Employee;

@Service("employeeService")
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployeeService(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployeeById(int empId) throws CustomException {
		Optional<Employee> optional = employeeRepository.findById(empId);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new CustomException("Record not found");
		}
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		return employees;
	}

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public void deleteEmployee(int empId) {
		employeeRepository.deleteById(empId);
	}

	public Employee updateEmployee(int empId, Employee newemployee) throws CustomException {
		Employee employee = getEmployeeById(empId);
		employee.setEmpName(newemployee.getEmpName());
		return employeeRepository.save(employee);
	}
}
