package com.cg.shoppingmall.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmall.entities.Employee;
import com.cg.shoppingmall.repository.JPAUtil;

public class IEmployeeRepositoryImpl implements IEmployeeRepository
{
	//Step-1: Start JPA LifeCycle
	//create entity manager object, and import
	
	private EntityManager entityManager;
	
	//create default constructor
	public IEmployeeRepositoryImpl() 
	{
		entityManager=JPAUtil.getEntityManager();	//call entitymanager from JPAUtil file
	}

	
	//First CRUD Operation
	//Create operation in repository/DAO
	@Override
	public Employee addEmployee(Employee employee) 
	{
		 entityManager.persist(employee);
		return employee;
	}

	

	@Override
	public Employee updateEmployee(Employee employee)
	{
		entityManager.merge(employee);
		return employee;
	}

	@Override
	public Employee searchEmployeeById(int id)
	{
		//to store the value in object of Employee
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) 
	{
		//need to find id of employee to remove
		Employee employee= entityManager.find(Employee.class, id);
		entityManager.remove(employee);
		return false;
	}


	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		
	}


	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
		
	}
	

}
