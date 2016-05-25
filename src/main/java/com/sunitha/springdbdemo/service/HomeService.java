package com.sunitha.springdbdemo.service;

import com.sunitha.springdbdemo.model.Employee;

/**
 * Created by raju on 25/5/16.
 */
public interface HomeService {
  Iterable<Employee> getAllEmployees();
  boolean createEmployee(Employee employee);
  boolean updateEmployee(Employee employee);
 Employee employeeDetails(int empId);
  boolean deleteEmployee(int empId);
}
