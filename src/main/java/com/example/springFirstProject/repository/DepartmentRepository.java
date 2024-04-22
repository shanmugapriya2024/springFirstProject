package com.example.springFirstProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springFirstProject.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> { 
	
    public Department findByDepartmentName(String departmentName);

}