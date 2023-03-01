package com.example.demo.Repo;

import com.example.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{
    List<Employee> findBydesiginationId(long id);

    List<Employee> findBydepartmentId(long id);

    List<Employee> findByOrderByExperienceDesc();

    Employee findByEmail(String username);
}
