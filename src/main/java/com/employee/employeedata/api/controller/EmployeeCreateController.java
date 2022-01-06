package com.employee.employeedata.api.controller;

import com.employee.employeedata.api.apimodel.EmployeeCreateRequest;
import com.employee.employeedata.api.apimodel.EmployeeCreateResponse;
import com.employee.employeedata.api.delegate.EmployeeCreateDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/v1", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class EmployeeCreateController {

    private final EmployeeCreateDelegate employeeCreateDelegate;

    public EmployeeCreateController(EmployeeCreateDelegate employeeCreateDelegate) {
        this.employeeCreateDelegate = employeeCreateDelegate;
    }

    @PostMapping(path = "/employee", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(CREATED)
    public EmployeeCreateResponse persistEmployee(@RequestBody EmployeeCreateRequest employeeRequest ) {
        log.info("Start: save employee record to database : {}");

        return employeeCreateDelegate.persistEmployeeData(employeeRequest);

    }


}
