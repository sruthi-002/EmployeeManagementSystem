package com.example.demo.Repo;

import com.example.demo.response.EmployeeProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProjectsRepo extends JpaRepository<EmployeeProjects,Long> {
}
