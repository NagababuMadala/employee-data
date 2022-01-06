package com.employee.employeedata.data.repository;


import com.employee.employeedata.data.datamodel.EmployeeDataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDataModel, String> {
}
