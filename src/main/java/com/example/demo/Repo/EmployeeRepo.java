package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;

import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{
}
