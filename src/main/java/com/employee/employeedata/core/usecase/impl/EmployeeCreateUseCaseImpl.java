package com.employee.employeedata.core.usecase.impl;

import com.employee.employeedata.common.configuration.UseCase;
import com.employee.employeedata.core.datasource.EmployeeCreateDataSource;
import com.employee.employeedata.core.entity.EmployeeCreateEntityRequest;
import com.employee.employeedata.core.entity.EmployeeCreateEntityResponse;
import com.employee.employeedata.core.usecase.EmployeeCreateUseCase;

@UseCase
public class EmployeeCreateUseCaseImpl implements EmployeeCreateUseCase {

    private final EmployeeCreateDataSource employeeCreateDataSource;

    public EmployeeCreateUseCaseImpl(EmployeeCreateDataSource employeeCreateDataSource) {
        this.employeeCreateDataSource = employeeCreateDataSource;
    }

    @Override
    public EmployeeCreateEntityResponse createEmployee(EmployeeCreateEntityRequest employeeCreateEntityRequest) {
        return employeeCreateDataSource.createEmployee(employeeCreateEntityRequest);
    }
}
