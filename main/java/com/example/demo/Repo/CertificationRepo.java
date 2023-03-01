package com.example.demo.Repo;

import com.example.demo.Model.Certifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepo extends JpaRepository<Certifications,Long> {
}
