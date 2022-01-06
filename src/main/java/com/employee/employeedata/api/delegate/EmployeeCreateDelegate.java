package com.employee.employeedata.api.delegate;

import com.employee.employeedata.api.apimodel.EmployeeCreateRequest;
import com.employee.employeedata.api.apimodel.EmployeeCreateResponse;

public interface EmployeeCreateDelegate {
    EmployeeCreateResponse persistEmployeeData(EmployeeCreateRequest employeeCreateRequest);
}
