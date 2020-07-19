package com.home.ejbs;

import java.util.List;

import javax.ejb.Local;

import com.home.models.Employee;

@Local
public interface EmployeeInfoBeanLocal
{
	List<Employee> getAllEmployees();
}
