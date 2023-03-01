package com.example.demo.Repo;

import com.example.demo.Model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll,Long> {
    List<Payroll> findByOrderBySalaryDesc();
}
