package com.sunitha.springdbdemo.repository;

import com.sunitha.springdbdemo.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by raju on 25/5/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
