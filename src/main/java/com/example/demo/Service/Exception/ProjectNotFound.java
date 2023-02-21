package com.example.demo.Service.Exception;

public class ProjectNotFound extends RuntimeException {
    public ProjectNotFound( String message)
    {
        super(message);
    }
}
