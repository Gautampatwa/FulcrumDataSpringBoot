package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.Pojo.Employee;
import com.example.SpringBoot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> getEmployee()
    {
        return employeeService.getEmployee();

    }
    @PostMapping("/save")
    public Employee save(Employee emp)
    {
        return  employeeService.saveOrUpdate(emp);
    }
}
