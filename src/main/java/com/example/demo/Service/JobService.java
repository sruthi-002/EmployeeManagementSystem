package com.example.demo.Service;

import com.example.demo.Model.Jobs;
import com.example.demo.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;
    public Jobs add(Jobs jobs) {
        return jobRepo.save(jobs);
    }
}
