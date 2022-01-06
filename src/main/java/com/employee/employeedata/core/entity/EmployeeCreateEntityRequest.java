package com.employee.employeedata.core.entity;

import org.immutables.value.Value;


@Value.Immutable
public interface EmployeeCreateEntityRequest {

   String employeeId() ;

  String firstName();

  String languageCode();

  String lastName();

  String emailAddress();

  String phoneNumber();

}
