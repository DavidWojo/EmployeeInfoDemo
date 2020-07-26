package com.home.ejbs;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.home.models.Employee;

@Stateless
@LocalBean
public class EmployeeBean implements EmployeeBeanLocal
{
	private EntityManager em = null;

    public EmployeeBean()
    {
    	System.out.println("********* Entering EmployeeBean  Constructor ******");
    	System.out.println("********* Exiting  EmployeeBean  Constructor ******");
    }
    
    @PostConstruct 
    public void init()
    {
    	System.out.println("********* Entering EmployeeBean init() ******");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
    	em = emf.createEntityManager();
    	System.out.println("********* Exiting  EmployeeBean init() ******");
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
