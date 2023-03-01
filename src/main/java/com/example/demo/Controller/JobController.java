package com.example.demo.Controller;

import com.example.demo.Model.Jobs;
import com.example.demo.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService jobService;
    @PostMapping("")
    private Jobs add(@RequestBody Jobs jobs)
    {
        return jobService.add(jobs);
    }
}
