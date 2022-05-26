package com.example.antrahwmerged.repository;

import com.example.antrahwmerged.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository {
    Department getDepartmentById(int id);
    List<Department> getAllDepartment();
}
