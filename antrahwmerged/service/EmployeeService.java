package com.example.antrahwmerged.service;

import com.example.antrahwmerged.domain.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    EmployeeDTO getEmployeeById(int id);

    List<EmployeeDTO> getAllEmployees();
}
