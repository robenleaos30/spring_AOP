package com.jdc.demo.service;

import org.springframework.stereotype.Component;

import com.jdc.demo.dto.Student;

@Component
public class DemoService {

	public void voidMethodWithoutArguments(String ...args) {
		System.out.println("This is a method form voidMethodWithoutArguments.");
	}
	
	public Student getStudent() {
		return new Student(1, "Roben", "093483872", "roben@gmail.com");
	}
}
