package com.example.demo;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassWordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("userPass");

        System.out.println(encodedPassword);

    }
}