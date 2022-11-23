package com.vladimirsokolov.spring.springboot.spring_data_jpa.dao;


import com.vladimirsokolov.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //Аннотацию @Repository можно не писать так как клас наследуется от JpaRepository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}

