package com.example.practicalspring.repository;

import com.example.practicalspring.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository <Employees, Integer>{
}
