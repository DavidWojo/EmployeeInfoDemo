package com.home.ejbs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.home.models.Employee;

/**
 * Session Bean implementation class EmployeeInfoBean
 */
@Singleton
@LocalBean
public class EmployeeInfoBean implements EmployeeInfoBeanLocal
{

    public EmployeeInfoBean()
    {
    }

	@Override
	public List<Employee> getAllEmployees()
	{
		List<Employee> l = new ArrayList<Employee>();
		Employee e = new Employee();
		e.setEmail("david@wojo");
		e.setFirstName("David");
		e.setLastName("Wojo");
		l.add(e);
		return l;
	}
}
