package com.employee.employeedata.api.apimodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDeleteResponse   {
  @JsonProperty("employeeId")
  private String employeeId ;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("languageCode")
  private String languageCode;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("phoneNumber")
  private String phoneNumber;
}

