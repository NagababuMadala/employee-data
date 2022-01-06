package com.employee.employeedata.api.controller;

import com.employee.employeedata.api.Exceptionhandler.BadRequestException;
import com.employee.employeedata.api.apimodel.EmployeeCreateRequest;
import com.employee.employeedata.api.apimodel.ErrorModel;
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

public class EmployeeGetController {

    @GetMapping(path = "/employee/{employeeId}")
    @ResponseStatus(OK)
    public String retrieveRewards(@PathVariable("memberId") String employeeId) {

        log.info("employeeId received to lookup data: {}", employeeId);

        if ((employeeId.isEmpty())) {
            throw new BadRequestException("employeeId should not be empty");
        }

        return "";
    }

    public Object createBadRequest(Errors errors) {
        return new ResponseEntity<>(ErrorModel.builder().statusCode(BAD_REQUEST.value())
                .userMessage(BAD_REQUEST.getReasonPhrase())
                .developerMessage("validation erros")
                .build(), HttpStatus.BAD_REQUEST);
    }

    private Object getEmployeeResponse(EmployeeCreateRequest employeeRequest) {
        return "";
    }

}
