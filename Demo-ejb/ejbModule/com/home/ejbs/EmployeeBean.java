package com.home.ejbs;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import com.home.models.Employee;

@Stateless
@LocalBean
public class EmployeeBean implements EmployeeBeanLocal
{
	private EntityManager em = null;

    public EmployeeBean()
    {
    	System.out.println("********* Constructor start ******");
    	System.out.println("********* Constructor end ******");
    }
    
    @PostConstruct 
    public void init()
    {
    	System.out.println("********* init() start ******");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
    	em = emf.createEntityManager();
    	System.out.println("********* init() end ******");
    }

	@Override
	public List<Employee> findAllEmployees()
	{
        TypedQuery query = em.createQuery("SELECT e FROM Employee e", Employee.class);
        return (List<Employee>)(query.getResultList());

		
//		List<Employee> employeeList = new ArrayList<Employee>();
//		Employee e = new Employee();
//		e.setFirstName("David");
//		e.setLastName("wojo");
//		e.setEmail("wojo@wojo");
//		employeeList.add(e);
//		return employeeList;
	}
}
