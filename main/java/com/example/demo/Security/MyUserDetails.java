package com.example.demo.Security;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MyUserDetails implements UserDetails {
    @Autowired(required = false)
        private Employee employee;
        public MyUserDetails(Employee employee) {
            this.employee=employee;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            Set<Role> roles=employee.getRoles();
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();

            for(Role role:roles) {
                authorities.add(new SimpleGrantedAuthority(role.getRoles()));
            }

            return authorities;
        }

        @Override
        public String getPassword() {
            // TODO Auto-generated method stub
            return employee.getPassword();
        }

        @Override
        public String getUsername() {
            // TODO Auto-generated method stub
            return employee.getEmail();
        }

        @Override
        public boolean isAccountNonExpired() {
            // TODO Auto-generated method stub
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            // TODO Auto-generated method stub
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            // TODO Auto-generated method stub
            return true;
        }

        @Override
        public boolean isEnabled() {
            // TODO Auto-generated method stub
            return employee.isEnabled();
        }
}
