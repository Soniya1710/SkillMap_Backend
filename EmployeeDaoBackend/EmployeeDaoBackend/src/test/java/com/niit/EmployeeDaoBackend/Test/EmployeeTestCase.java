package com.niit.EmployeeDaoBackend.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.EmployeeDaoBackend.Config.HibernateConfigFile;
import com.niit.EmployeeDaoBackend.Model.Employee;
import com.niit.EmployeeDaoBackend.Service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HibernateConfigFile.class) 
public class EmployeeTestCase {
	@Autowired
	private EmployeeService empServices;
	
	private Employee emp;
	
	@Before
	public void setUp() throws Exception {
		
		emp=new Employee();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	/*@Test(expected=Exception.class)*/
	/* @Test
	public void AddEmployee()
	{
	  	
		emp.setEmployeeid(124);
	  	emp.setEmployeename("Soniya");
	  	emp.setEmail("mohanss@gmail.com");
	  	emp.setPass("mohamedss");
	  	emp.setAge(30);
	  	emp.setMobile("9843099935");
	  	emp.setGender("male");
	  	emp.setQualification("btech");
		
	  //	assertEquals("Success",true,empServices.addservice(emp));
	  	assertEquals("Success",true,empServices.addservice(emp));
	}
	@Test
	public void AddEmployee1()
	{
		emp.setEmployeeid(201);
	  	emp.setEmployeename("ram");
	  	emp.setEmail("ram@gmail.com");
	  	emp.setPass("ramram");
	  	emp.setAge(35);
	  	emp.setMobile("9843095934");
	  	emp.setGender("male");
	  	emp.setQualification("be");
		
	  //	assertEquals("Success",true,empServices.addservice(emp));
	  	assertEquals("Success",true,empServices.addservice(emp));
	}*/
	/*@Test
	public void deleteData()
	{
		assertEquals("not found",true,empServices.deleteService(201));
	}*/
	
	/*@Test
	public void updateEmployee() 
	{
		emp=empServices.getUpdateId(124);
		emp.setEmployeename("Priya");
		
		assertEquals("Successfully Updated",true, empServices.updateEmployee(emp));
	}
	
	@Test
	public void getAllEmployeeTest()
	{
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = empServices.getAll();
		
		System.out.println("Size of employeeList = "+employeeList);
		assertEquals("Success", true, employeeList.size()!=0);
		
	}*/
}


