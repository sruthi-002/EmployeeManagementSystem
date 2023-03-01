package com.example.demo.Service.Exception;

public class DepartmentNotFound extends RuntimeException {
    public DepartmentNotFound( String message)
    {
        super(message);
    }
}
