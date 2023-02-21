package com.example.demo.Service;

import com.example.demo.Model.TimeSheet;
import com.example.demo.Repo.TimeSheetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeSheetService {
    @Autowired
    private TimeSheetRepo timeSheetRepo;
    public TimeSheet add(TimeSheet timesheet) {
        return timeSheetRepo.save(timesheet);
    }

    public List<TimeSheet> all() {
        return timeSheetRepo.findAll();
    }
}
