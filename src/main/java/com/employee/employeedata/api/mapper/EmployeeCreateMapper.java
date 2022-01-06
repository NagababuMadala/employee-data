package com.employee.employeedata.api.mapper;

import com.employee.employeedata.api.apimodel.EmployeeCreateRequest;
import com.employee.employeedata.api.apimodel.EmployeeCreateResponse;
import com.employee.employeedata.core.entity.EmployeeCreateEntityRequest;
import com.employee.employeedata.core.entity.EmployeeCreateEntityResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeCreateMapper {
    @Mapping(source = "employeeId", target = "employeeId")
    @Mapping(source = "firstName",target = "firstName")
    @Mapping(source = "languageCode",target = "languageCode")
    @Mapping(source = "lastName",target = "lastName")
    @Mapping(source = "emailAddress",target = "emailAddress")
    @Mapping(source = "phoneNumber",target = "phoneNumber")
    EmployeeCreateEntityRequest mapEmployeeCreateRequest(EmployeeCreateRequest employeeCreateRequest);
    @Mapping(source = "employeeId", target = "employeeId")
    @Mapping(source = "firstName",target = "firstName")
    @Mapping(source = "languageCode",target = "languageCode")
    @Mapping(source = "lastName",target = "lastName")
    @Mapping(source = "emailAddress",target = "emailAddress")
    @Mapping(source = "phoneNumber",target = "phoneNumber")
    EmployeeCreateResponse mapEmployeeCreateResponse
            (EmployeeCreateEntityResponse employeeCreateEntityResponse);

}
