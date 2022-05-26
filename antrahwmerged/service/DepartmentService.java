package com.example.antrahwmerged.service;

import com.example.antrahwmerged.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    Department getDepartmentById(int id);
    Department getAllDepartment();
}
