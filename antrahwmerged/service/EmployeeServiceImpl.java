package com.example.antrahwmerged.service;

import com.example.antrahwmerged.entity.EmployeeDTO;
import com.example.antrahwmerged.entity.Employee;
import com.example.antrahwmerged.repository.EmployeeRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final Log logger = LogFactory.getLog(EmployeeServiceImpl.class);
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public EmployeeDTO getEmployeeById(int id) {
        logger.info("trying to get this employee by id: " + id);
        Employee employee = employeeRepository.getEmployeeById(id);
        if(employee == null) {
            logger.error("employee is null");
            throw new RuntimeException((id + ": employee is null"));
        }
        return new EmployeeDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository
                .getAllEmployees()
                .stream()
                .map(e -> new EmployeeDTO(e))
                .collect(Collectors.toList());
    }
}
