package com.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;

@Service
@RefreshScope
public class EmployeeService {
	@Value("${message.greeting}")
	 String message;
	
	@Value("${employee.name}")
	 String name;
	
	public Employee getEmployeeDetails() {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		emp.setMessage(message);
		return emp;
		
	}
}
