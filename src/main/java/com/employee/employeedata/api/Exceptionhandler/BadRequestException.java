package com.employee.employeedata.api.Exceptionhandler;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String  message) {
        super(message);
    }
}
