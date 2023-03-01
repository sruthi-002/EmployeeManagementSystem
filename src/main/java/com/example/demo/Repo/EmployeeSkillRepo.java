package com.example.demo.Repo;

import com.example.demo.response.Employeeskills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeSkillRepo extends JpaRepository<Employeeskills,Long> {
    List<Employeeskills> findBySkillId(long id);
}
