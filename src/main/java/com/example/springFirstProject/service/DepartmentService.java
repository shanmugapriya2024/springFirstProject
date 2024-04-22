package com.example.springFirstProject.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.springFirstProject.entity.Department;

@Component
public interface DepartmentService {

 	public Department saveDepartment ( Department department);
 	
 	public Department getDepartment ( Long departmentId);
 	
 	public List<Department> getAllDepartments ();

 	public Department getDepartmentName(String depName);
 	
 	public void deleteDepartment(Long id);


}