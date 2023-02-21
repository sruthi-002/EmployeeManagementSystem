package com.example.demo.Service.Exception;

public class EmployeeNotFound extends RuntimeException {
        public EmployeeNotFound( String message)
        {
            super(message);
        }
}
