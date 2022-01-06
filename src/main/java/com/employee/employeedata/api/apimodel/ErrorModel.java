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
public class ErrorModel  {
  @JsonProperty("developerMessage")
  private String developerMessage;

  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("moreInfo")
  private String moreInfo;

  @JsonProperty("statusCode")
  private Integer statusCode;

  @JsonProperty("userMessage")
  private String userMessage;
}

