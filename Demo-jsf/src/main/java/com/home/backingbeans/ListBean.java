package com.home.backingbeans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.home.ejbs.EmployeeBeanLocal;
import com.home.models.Employee;


@SessionScoped
@Named
public class ListBean implements Serializable
{
	@EJB
	private EmployeeBeanLocal eBean;
	
	private static final long serialVersionUID = 1L;
	private String myText = "Hello World";

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
	}
	
	private List<String> stringList = new ArrayList<>();

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
	
	@PostConstruct
	public void init()
	{
		employeeList = eBean.findAllEmployees();
	}
	
	public ListBean()
	{
		this.stringList.add("1");
		this.stringList.add("2");
	}
	
	
	private List<Employee> employeeList = new ArrayList<>();

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
