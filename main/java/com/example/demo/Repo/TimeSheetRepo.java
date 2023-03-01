package com.example.demo.Repo;

import com.example.demo.Model.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSheetRepo extends JpaRepository<TimeSheet,Long> {
}
