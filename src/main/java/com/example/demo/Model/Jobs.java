package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "jobs")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private List<Long> empId;
    private long projectId;
    private String jobs;
    private Date  startDate;
    private Date endDate;
    private int estimatedHours;
    private int workedhours;
}
