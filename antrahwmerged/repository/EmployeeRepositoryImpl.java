package com.example.antrahwmerged.repository;

import com.example.antrahwmerged.domain.Employee;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

//    private Map<Integer, Employee> employeeMap = new HashMap<>();
    private Map<Integer, Employee> employeeMap = new HashMap<>();
    @PostConstruct
    public void init() {
//        Employee employee1 = new Employee(1,"Amy");
//        Employee employee2 = new Employee(2, "Bob");
//        employeeMap.put(employee1.getId(), employee1);
//        employeeMap.put(employee2.getId(), employee2);



    }




    @Override
    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeMap.values().stream().collect(Collectors.toList());
    }
}
