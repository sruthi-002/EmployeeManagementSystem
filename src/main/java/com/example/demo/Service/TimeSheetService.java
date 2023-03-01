package com.example.demo.Service;

import com.example.demo.Model.TimeSheet;
import com.example.demo.Repo.TimeSheetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.ArrayList;
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

    public List<TimeSheet> get_timesheet(long project_id) {
        List<TimeSheet> timeSheetList = timeSheetRepo.findAll();
        List<TimeSheet> timeSheets= new ArrayList<TimeSheet>();
        timeSheetList.forEach(id->{
            long p= id.getProject_id();
            if(p==project_id)
            {
                timeSheets.add(id);
            }
        });
        return timeSheets;
    }
    public List<TimeSheet> get_timesheetByEmployeeId(long empId)
    {
        List<TimeSheet> timeSheetList = timeSheetRepo.findAll();
        List<TimeSheet> timeSheets= new ArrayList<TimeSheet>();
        timeSheetList.forEach(id->{
            long p= id.getEmployee_id();
            if(p==empId)
            {
                timeSheets.add(id);
            }
        });
        return timeSheets;
    }
}
