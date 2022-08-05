package com.example.SpringBoot1.service;

import com.example.SpringBoot1.Pojo.Employee;
import com.example.SpringBoot1.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService{
    @Autowired()
    EmployeeRepo employeeRepos;

    public List<Employee> getEmployee()
    {
        List<Employee> employee=new ArrayList<Employee>();
        for (Employee employee1 : employeeRepos.findAll()) {
            employee.add(employee1);
        }
        return  employee;
    }
    public Employee saveOrUpdate(Employee employee)
    {
        return employeeRepos.save(employee);
    }


}
