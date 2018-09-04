package com.niit.EmployeeDaoBackend.Dao;

import java.util.List;

import com.niit.EmployeeDaoBackend.Model.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee emp);

	public boolean updateEmployee(Employee employeeid);
	public boolean deleteEmployee(int employeeid);
	
	public Employee getUpdateId(int employeeid);
	
	public Employee getEmployeebyId(int employeeid);
	
	public List<Employee>getAll();

}
