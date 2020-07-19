package com.home.backingbeans;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;

import com.home.services.EmployeeService;

@RequestScoped
@Named
public class EmployeeFormBean
{
	private static final String labelFirstName = "First Name:";
	private static final String labelLastName = "Last Name:";
	private EmployeeService employeeService = null;

	public static String getLabelFirstName() {
		return labelFirstName;
	}
	
	public static String getLabelLastName() {
		return labelLastName;
	}
	
	public EmployeeFormBean()
	{
//		entityManagerBean = new EntityManagerBeanImpl();
//		EntityManagerFactory emf = 
//				Persistence.createEntityManagerFactory("EmployeeService");
//		EntityManager em = emf.createEntityManager();
//		if (this.entityManagerBean == null)
//			System.out.println("UNEXPECTED NULL");
//		employeeService = new EmployeeService(this.entityManagerBean.getEntityManager());
//		doThis(employeeService, this.entityManagerBean.getEntityManager(), "David", "Wojo", "davidwojo15@gmail.com");
//		doThis(employeeService, em, "Sylvia","Ked",  "sylvia@gmail.com");
//		doThis(employeeService, em, "Alice", "Ked",  "alice@gmail.com");
	}
	
//	private void doThis(EmployeeService es, EntityManager em, String firstName, String lastName, String email)
//	{
//		em.getTransaction().begin();
//		es.createEmployee(firstName, lastName, email);
//		em.getTransaction().commit();
//	}
}
