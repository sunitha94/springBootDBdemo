package com.sunitha.springdbdemo.service;

import com.sunitha.springdbdemo.model.Employee;
import com.sunitha.springdbdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by raju on 25/5/16.
 */
@Component
public class HomeServiceImpl implements HomeService {
  @Autowired
  EmployeeRepository employeeRepository;

  @Override
  public Iterable<Employee> getAllEmployees() {

    return employeeRepository.findAll();
  }
  public boolean createEmployee(Employee employee)
  {
    employeeRepository.save(employee);
    return  true;
  }
  public boolean updateEmployee(Employee employee)
  {
    employeeRepository.save(employee);
    return true;
  }
  public Employee employeeDetails(int empId)
  {
    return employeeRepository.findOne(empId);
  }
  public boolean deleteEmployee(int empId)
  {
    employeeRepository.delete(empId);
    return  true;
  }
}