package com.example.antrahwmerged.service;

import com.example.antrahwmerged.entity.Department;
import com.example.antrahwmerged.entity.Employee;
import com.example.antrahwmerged.entity.EmployeeDTO;
import com.example.antrahwmerged.repository.DepartmentRepository;
import com.example.antrahwmerged.repository.EmployeeRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

public class DepartmentServiceImpl implements DepartmentService{
    private final Log logger = LogFactory.getLog(EmployeeServiceImpl.class);
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department getDepartmentById(int id) {
        logger.info("trying to get this employee by id: " + id);
        Department department = departmentRepository.getDepartmentById(id);
        if(department == null) {
            logger.error("employee is null");
            throw new RuntimeException((id + ": employee is null"));
        }
        return new Department(department);
    }

    @Override
    public Department getAllDepartment() {
        return (Department) departmentRepository
                .getAllDepartment()
                .stream()
                .map(e -> new Department(e))
                .collect(Collectors.toList());
    }

}
