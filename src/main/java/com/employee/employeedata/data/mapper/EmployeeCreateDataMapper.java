package com.employee.employeedata.data.mapper;

import com.employee.employeedata.core.entity.EmployeeCreateEntityRequest;
import com.employee.employeedata.core.entity.EmployeeCreateEntityResponse;
import com.employee.employeedata.data.datamodel.EmployeeDataModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeCreateDataMapper {
    @Mapping(source = "employeeId", target = "employeeId")
    @Mapping(source = "firstName",target = "firstName")
    @Mapping(source = "languageCode",target = "languageCode")
    @Mapping(source = "lastName",target = "lastName")
    @Mapping(source = "emailAddress",target = "emailAddress")
    @Mapping(source = "phoneNumber",target = "phoneNumber")
    EmployeeDataModel mapEmployeeDataModelRequest(EmployeeCreateEntityRequest employeeCreateEntityRequest);
    @Mapping(source = "employeeId", target = "employeeId")
    @Mapping(source = "firstName",target = "firstName")
    @Mapping(source = "languageCode",target = "languageCode")
    @Mapping(source = "lastName",target = "lastName")
    @Mapping(source = "emailAddress",target = "emailAddress")
    @Mapping(source = "phoneNumber",target = "phoneNumber")
    EmployeeCreateEntityResponse mapEmployeeDataModelResponse(EmployeeDataModel employeeDataModel);
}
