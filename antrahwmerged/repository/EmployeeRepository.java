package com.example.antrahwmerged.repository;

import com.example.antrahwmerged.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  {
    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();


}
