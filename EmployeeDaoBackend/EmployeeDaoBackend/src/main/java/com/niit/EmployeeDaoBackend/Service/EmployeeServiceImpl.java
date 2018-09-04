package com.niit.EmployeeDaoBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.EmployeeDaoBackend.Dao.EmployeeDao;
import com.niit.EmployeeDaoBackend.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeedao;
	public boolean addservice(Employee emp) {
		// TODO Auto-generated method stub
		return (employeedao.addEmployee(emp));	
	}

	public boolean deleteService(int employeeid) {
		// TODO Auto-generated method stub
		return (employeedao.deleteEmployee(employeeid));
		
	}

	public boolean updateEmployee(Employee employeeid) {
		// TODO Auto-generated method stub
		return(employeedao.updateEmployee(employeeid));
		
	}

	public Employee getUpdateId(int employeeid) {
		// TODO Auto-generated method stub
		 return(employeedao.getUpdateId(employeeid));
			
	}

	public Employee getEmployeebyId(int employeeid) {
		// TODO Auto-generated method stub
		 return(employeedao.getEmployeebyId(employeeid));
			
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return(employeedao.getAll());
		
	}

}
