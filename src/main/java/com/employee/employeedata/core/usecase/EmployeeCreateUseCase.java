package com.employee.employeedata.core.usecase;

import com.employee.employeedata.core.entity.EmployeeCreateEntityRequest;
import com.employee.employeedata.core.entity.EmployeeCreateEntityResponse;

public interface EmployeeCreateUseCase {

    EmployeeCreateEntityResponse createEmployee (EmployeeCreateEntityRequest employeeCreateEntityRequest);
}
