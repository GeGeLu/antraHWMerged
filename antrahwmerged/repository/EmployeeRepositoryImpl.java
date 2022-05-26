package com.example.antrahwmerged.repository;

import com.example.antrahwmerged.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{


    private Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeMap.values().stream().collect(Collectors.toList());
    }
}
