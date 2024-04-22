package com.example.springFirstProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springFirstProject.entity.Department;
import com.example.springFirstProject.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
        return departmentRepository.save(department); 
	}

	@Override
	public Department getDepartment(Long departmentID) {
		// TODO Auto-generated method stub
		Optional<Department> department  = departmentRepository.findById(departmentID);
		if (!department.isPresent()) {
			throw new RuntimeException("Department not found");
		}
		return department.get();
	}

	@Override
	public  List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		List<Department> departments  = departmentRepository.findAll();

		return departments;
	}

	@Override
	public  Department getDepartmentName(String depName) {
		// TODO Auto-generated method stub
	return  departmentRepository.findByDepartmentName(depName);

	}
	
	public void deleteDepartment(Long id) {
		 departmentRepository.deleteById(id);
	}



}
