package com.example.springFirstProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springFirstProject.entity.Department;
import com.example.springFirstProject.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/departments")
	public Department  saveDepartment(@RequestBody Department department) {
	System.out.println("Test controller");
		return  departmentService.saveDepartment(department);
	}
	
	@GetMapping("/getDepartments/{id}")
    public Department getDepartment(@PathVariable("id")  Long id)
	{
		return departmentService.getDepartment(id);
	}
	
	@GetMapping("/getAllDepartments")
    public List<Department> getAllDepartment()
	{
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/getDepartmentName/{name}")
	public Department getDepartmentByName(@PathVariable("name") String deptName) {
		return  departmentService.getDepartmentName(deptName);
	}
	
	

	@DeleteMapping("/delete/{id}")
	public String updateDepartment( @PathVariable("id") Long id) {
		 departmentService.deleteDepartment(id);
		 return "Deleted succefully";

	}


}