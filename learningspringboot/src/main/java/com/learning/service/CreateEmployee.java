package com.learning.service;

import com.learning.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class CreateEmployee implements CrudInterface {
    @Override
    public Employee createEmployee(Employee employee) {
        System.out.println(employee.getAge());
        System.out.println(employee.getDepartment());
        System.out.println(employee.getName());
        return employee;
    }
}
