package com.employee.employeedata.api.controller;

import com.employee.employeedata.api.apimodel.EmployeeCreateRequest;
import com.employee.employeedata.api.apimodel.EmployeeUpdateRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/v2", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)

public class EmployeeUpdateController {

    @PutMapping(value= "/employee/{employeeId}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(OK)
    public Object updateEmployee(@RequestBody EmployeeUpdateRequest request) {

        log.info("Employee Request to update card to db for employee Id '{}'",
                request.getEmployeeId());
        return " ";

    }
}
