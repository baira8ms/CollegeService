package com.spring.examples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.examples.beans.StudentDTO;
import com.spring.examples.feignClient.StudentFeignClient;

@Service
public class CollageService {

	@Autowired
	private StudentFeignClient studentFeignClient;

	public StudentDTO getStudentDetails(String studentId) {
		return studentFeignClient.getAllStudents().stream().filter(
				studentObj -> studentObj.getStudentID()== Integer.valueOf(studentId)
				).findAny().get();
	}
	
	
}