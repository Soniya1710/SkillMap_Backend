package com.niit.EmployeeDaoBackend.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EmployeeDaoBackend.Model.Employee;

@Repository("employeedao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
    private SessionFactory sessionFact;
	
	
	private boolean b = true;
	public boolean addEmployee(Employee emp) {
		sessionFact.getCurrentSession().save(emp);
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		  sessionFact.getCurrentSession().update(employee);
			
			return true;
	}

	public boolean deleteEmployee(int employeeid) {
		Employee emp=getEmployeebyId(employeeid);
		if(emp!=null)
		{
			sessionFact.getCurrentSession().delete(emp);
				return true;
		}
		else
			return false;
	
	}

	public Employee getUpdateId(int employeeid) {
		// TODO Auto-generated method stub
		return sessionFact.getCurrentSession().get(Employee.class, employeeid);
		
	}
	public Employee getEmployeebyId(int employeeid) {
		// TODO Auto-generated method stub
		 return sessionFact.getCurrentSession().get(Employee.class, employeeid);
			
	}

	public List<Employee> getAll() {
		return (List<Employee>) sessionFact.getCurrentSession().createCriteria(Employee.class).list();
		
	}

}
