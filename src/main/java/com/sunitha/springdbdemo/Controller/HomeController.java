package com.sunitha.springdbdemo.Controller;

import com.sunitha.springdbdemo.model.Employee;
import com.sunitha.springdbdemo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by raju on 25/5/16.
 */
@Controller
public class HomeController {
  @Autowired
  HomeService homeService;

  @RequestMapping(value = "/")
  public String home() {
    return "index";
  }

  @RequestMapping(value = "/employees")
  public String employeeDetails(Model model) {
    model.addAttribute("employee", homeService.getAllEmployees());
    return "emplyees";
  }

  @RequestMapping(value = "/employees/{empId}")
  public String addEmployee(@PathVariable(value = "empId") int empId, Model model) {
    model.addAttribute("employee", homeService.employeeDetails(empId));
    return "editEmployee";
  }

  @RequestMapping(value = "/employees/update")
  public String updateEmplyees(Employee employee, Model model) {
    homeService.updateEmployee(employee);
    return "redirect:/employees";
  }

  @RequestMapping(value = "/emplyees/{empId}/delete")
  public String deleteEmployee(@PathVariable(value = "empId") int empId, Model model) {
    homeService.deleteEmployee(empId);
    model.addAttribute("employees",homeService.getAllEmployees());
    return "employees";
  }
  @RequestMapping(value = "")
}
