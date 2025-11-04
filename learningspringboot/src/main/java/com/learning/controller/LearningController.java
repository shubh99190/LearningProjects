package com.learning.controller;

import com.learning.entity.Employee;
import com.learning.service.CrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LearningController {
    @Autowired
    private CrudInterface crudInterface;
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return crudInterface.createEmployee(employee);
    }
}
