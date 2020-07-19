package com.home.backingbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.home.ejbs.EmployeeInfoBean;
import com.home.models.Employee;


@RequestScoped
@Named
public class EmployeeListFormBean
{

	@EJB
	EmployeeInfoBean eib;
	public List<Employee> getEmployeeList()
	{
		return eib.getAllEmployees();
	}
	
	public void setEmployeeList(List<Employee> employeeList)
	{
	}
	
	public EmployeeListFormBean()
	{
	}
}
