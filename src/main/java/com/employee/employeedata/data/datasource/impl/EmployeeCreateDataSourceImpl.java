package com.employee.employeedata.data.datasource.impl;

import com.employee.employeedata.common.configuration.DataSource;
import com.employee.employeedata.core.datasource.EmployeeCreateDataSource;
import com.employee.employeedata.core.entity.EmployeeCreateEntityRequest;
import com.employee.employeedata.core.entity.EmployeeCreateEntityResponse;
import com.employee.employeedata.data.datamodel.EmployeeDataModel;
import com.employee.employeedata.data.mapper.EmployeeCreateDataMapper;
import com.employee.employeedata.data.repository.EmployeeRepository;

@DataSource
public class EmployeeCreateDataSourceImpl implements EmployeeCreateDataSource {

    private final EmployeeCreateDataMapper employeeCreateDataMapper;
    private final EmployeeRepository employeeRepository;

    public EmployeeCreateDataSourceImpl(EmployeeCreateDataMapper employeeCreateDataMapper,
                                        EmployeeRepository employeeRepository) {
        this.employeeCreateDataMapper = employeeCreateDataMapper;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeCreateEntityResponse createEmployee(EmployeeCreateEntityRequest employeeCreateEntityRequest) {
        EmployeeDataModel mapEmployeeDataModelRequest = employeeCreateDataMapper.mapEmployeeDataModelRequest(employeeCreateEntityRequest);
        EmployeeDataModel employeeDataModel = employeeRepository.save(mapEmployeeDataModelRequest);
        return employeeCreateDataMapper.mapEmployeeDataModelResponse(employeeDataModel);
    }
}
