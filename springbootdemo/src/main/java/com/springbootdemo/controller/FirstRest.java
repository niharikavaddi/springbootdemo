package com.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootdemo.model.Employee;


@RestController
public class FirstRest {

	@GetMapping(value = "/one")
	public String bussinessLogic() {
		return "HELLO";
	}

	@GetMapping(value = "/two")
	public Employee getEmployee() {
		return new Employee("Niharika", 2);

	}

}
