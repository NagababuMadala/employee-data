package com.employee.employeedata.core.datasource;

import com.employee.employeedata.core.entity.EmployeeCreateEntityRequest;
import com.employee.employeedata.core.entity.EmployeeCreateEntityResponse;

public interface EmployeeCreateDataSource {

    EmployeeCreateEntityResponse createEmployee (EmployeeCreateEntityRequest employeeCreateEntityRequest);
}
