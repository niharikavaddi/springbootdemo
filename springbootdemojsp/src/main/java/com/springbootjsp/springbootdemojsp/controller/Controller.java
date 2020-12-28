package com.springbootjsp.springbootdemojsp.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootjsp.springbootdemojsp.model.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Controller
public class Controller {

	@PostMapping(value = "save")
	public String hello(@ModelAttribute User user) {
		return "success";
	}

}
