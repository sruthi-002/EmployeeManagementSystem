package com.example.demo.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

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
    private long empId;
    private long projectId;
    private String jobs;
    private Date  startDate;
    private Date endDate;
    private int estimatedHours;
    private int workedhours;
}
