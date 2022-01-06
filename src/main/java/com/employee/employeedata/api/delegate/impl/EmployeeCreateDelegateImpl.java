package com.employee.employeedata.api.delegate.impl;

import com.employee.employeedata.api.apimodel.EmployeeCreateRequest;
import com.employee.employeedata.api.apimodel.EmployeeCreateResponse;
import com.employee.employeedata.api.delegate.EmployeeCreateDelegate;
import com.employee.employeedata.api.mapper.EmployeeCreateMapper;
import com.employee.employeedata.common.configuration.Delegate;
import com.employee.employeedata.core.usecase.EmployeeCreateUseCase;

@Delegate
public class EmployeeCreateDelegateImpl implements EmployeeCreateDelegate {

    private final EmployeeCreateUseCase employeeCreateUseCase;
    private final EmployeeCreateMapper employeeCreateMapper;

    public EmployeeCreateDelegateImpl(EmployeeCreateUseCase employeeCreateUseCase,
                                      EmployeeCreateMapper employeeCreateMapper) {
        this.employeeCreateUseCase = employeeCreateUseCase;
        this.employeeCreateMapper = employeeCreateMapper;
    }

    @Override
    public EmployeeCreateResponse persistEmployeeData(EmployeeCreateRequest employeeCreateRequest) {
        return employeeCreateMapper.mapEmployeeCreateResponse(
                employeeCreateUseCase.createEmployee(
                        employeeCreateMapper.mapEmployeeCreateRequest(employeeCreateRequest)));
    }
}
