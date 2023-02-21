package com.example.demo.Controller;

import com.example.demo.Model.TimeSheet;
import com.example.demo.Service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TimeSheetController {
    @Autowired
    private TimeSheetService timeSheetService;
    @PostMapping("/add_timesheet")
    private TimeSheet add(@RequestBody TimeSheet timesheet)
    {
        return timeSheetService.add(timesheet);
    }
    @GetMapping("/all_timesheet")
    private List<TimeSheet> all()
    {
        return timeSheetService.all();
    }
}
