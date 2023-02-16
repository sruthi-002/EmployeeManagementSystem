package com.example.demo.Repo;

import com.example.demo.Model.Desigination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesiginationRepo extends JpaRepository<Desigination , Long>{
}
