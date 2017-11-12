package com.spring.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.examples.beans.StudentDTO;
import com.spring.examples.service.CollageService;

@RestController
@RequestMapping(value = "/rest/college")
public class CollegeController {

	@Autowired
	CollageService collageService;

	@RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
	public StudentDTO getAllStudents(@PathVariable String studentId) {
		return (StudentDTO) collageService.getStudentDetails(studentId);
	}
}
