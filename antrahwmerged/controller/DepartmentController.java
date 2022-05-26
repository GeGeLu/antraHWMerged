package com.example.antrahwmerged.controller;

import com.example.antrahwmerged.entity.Department;
import com.example.antrahwmerged.entity.EmployeeDTO;
import com.example.antrahwmerged.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getAllDepartment() {
        return new ResponseEntity<>(departmentService.getAllDepartment(), HttpStatus.OK);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable int id) {
        return new ResponseEntity<>(departmentService.getDepartmentById(), HttpStatus.OK);
    }

    @GetMapping("/exception")
    public ResponseEntity<Department> testException() throws Exception {
        throw new Exception("this is exception");
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleRuntimeException() {
        return new ResponseEntity("this is 404 response", HttpStatus.NOT_FOUND);
    }
}
