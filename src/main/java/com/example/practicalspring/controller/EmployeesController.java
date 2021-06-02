package com.example.practicalspring.controller;

import com.example.practicalspring.entity.Employees;
import com.example.practicalspring.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/employees")
public class EmployeesController {
    @Autowired
    private EmployeesRepository employeesRepository;

    @GetMapping(value = "/index")
    public Iterable<Employees> findAllEmployees(){
        return employeesRepository.findAll();
    }

    @PostMapping(value = "/create")
    public String createEmployee(@RequestBody Employees employees){
        employeesRepository.save(employees);
        return "save thành công";
    }
}
