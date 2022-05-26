package com.example.antrahwmerged.service;

import com.example.antrahwmerged.entity.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    EmployeeDTO getEmployeeById(int id);

    List<EmployeeDTO> getAllEmployees();
}
