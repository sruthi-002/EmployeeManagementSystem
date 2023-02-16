package com.example.demo.Repo;

import com.example.demo.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
    Department findByDepart(String name);
    @Query(value = "SELECT DISTINCT depart from department",nativeQuery = true)
    List<String> findByDepartment();
}
