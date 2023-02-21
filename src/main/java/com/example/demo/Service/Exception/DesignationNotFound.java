package com.example.demo.Service.Exception;

public class DesignationNotFound extends RuntimeException {
    public DesignationNotFound( String message)
    {
        super(message);
    }
}
