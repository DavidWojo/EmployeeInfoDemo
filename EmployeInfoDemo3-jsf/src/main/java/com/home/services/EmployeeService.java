package com.home.services;

import java.util.Collection;
import com.home.models.Employee;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


public class EmployeeService
{
    protected EntityManager em;

    public EmployeeService(EntityManager em)
    {
        this.em = em;
    }

    public Employee createEmployee(String firstName, String lastName, String email)
    {
        Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setEmail(email);
        em.persist(emp);
        return emp;
    }

    public void removeEmployee(int id)
    {
        Employee emp = findEmployee(id);
        if (emp != null) {
            em.remove(emp);
        }
    }

    public Employee findEmployee(int id)
    {
        return em.find(Employee.class, id);
    }

    public Collection<Employee> findAllEmployees()
    {
        TypedQuery query = em.createQuery("SELECT e FROM Employee e", Employee.class);
        return query.getResultList();
    }
}
