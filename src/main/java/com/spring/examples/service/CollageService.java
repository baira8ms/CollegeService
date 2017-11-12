package com.spring.examples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.examples.feignClient.StudentFeignClient;
import com.spring.examples.jpa.pojo.Student;

@Service
public class CollageService {

	@Autowired
	private StudentFeignClient studentFeignClient;

	public Student getStudentDetails(String studentId) {
		return studentFeignClient.getAllStudents().stream().filter(
				studentObj -> studentObj.getStudentID()== Integer.valueOf(studentId)
				).findAny().get();
	}
	
	
}