package com.myspringapp.mycrud.dao;

import com.myspringapp.mycrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
