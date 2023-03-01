package com.example.demo.Repo;

import com.example.demo.response.EmployeeCertifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeCertificationRepo extends JpaRepository<EmployeeCertifications,Long> {

    List<EmployeeCertifications> findByCertId(long id);
}
