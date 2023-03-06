package com.example.demo;

import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentControllerTests {
    @Autowired
    private DepartmentService departmentService;
    @Test
    private Department  add_department() throws Exception {
        Department d1 = new Department(1,1,"ECE");
        return departmentService.add_department(d1);
    }
    @Test
    private List<Department> all_department()
    {
//        List<Department> departments = new ArrayList<Department>();
//        Department d1 = new Department(7,7,"CSE");
//        Department d2=new Department(8,8,"CIVIL");
//        Department d3 = new Department(9,9,"MECH");
//        departments.add(d1);
//        departments.add(d2);
//        departments.add(d3);
        return departmentService.display_department();
    }

}
