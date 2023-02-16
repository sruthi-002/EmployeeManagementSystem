package com.example.demo.Service;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Repo.DepartmentRepo;
import com.example.demo.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private EmployeeRepo employeeRepo;

    public Department add_department(Department d) {
        return departmentRepo.save(d);
    }

    //public String getdepart(long empId) {
        //Employee emp = erepo.findById(empId).get();
        //long d =emp.getDepartment();
        //return d;
    //}

    public long getname(String name) {
        Department d = departmentRepo.findByDepart(name);
        int i= (int) d.getDid();
        return i;
    }



    public List<Department> display_department() {

        return departmentRepo.findAll();
    }
}
