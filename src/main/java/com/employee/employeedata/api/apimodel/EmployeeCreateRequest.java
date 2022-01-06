package com.employee.employeedata.api.apimodel;

import org.immutables.value.Value;

@Value.Immutable
public interface EmployeeCreateRequest   {

  String employeeId() ;

  String firstName();

  String languageCode();

  String lastName();

  String emailAddress();

  String phoneNumber();
}

