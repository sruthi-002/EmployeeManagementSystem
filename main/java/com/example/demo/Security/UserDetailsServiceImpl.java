package com.example.demo.Security;

import com.example.demo.Model.Employee;
import com.example.demo.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired(required = false)
    private EmployeeRepo employeeRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee user =employeeRepo.findByEmail(username);
        if(user==null) {
            throw new UsernameNotFoundException("Could not find User");
        }
        return new MyUserDetails(user);
    }

}