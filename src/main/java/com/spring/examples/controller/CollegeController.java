package com.spring.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.examples.jpa.pojo.Student;
import com.spring.examples.service.CollageService;

@RestController
@RequestMapping(value = "/rest/college")
public class CollegeController {

	@Autowired
	CollageService collageService;

	@RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
	public Student getAllStudents(@RequestParam String studentId) {
		return (Student) collageService.getStudentDetails(studentId);
	}
}
