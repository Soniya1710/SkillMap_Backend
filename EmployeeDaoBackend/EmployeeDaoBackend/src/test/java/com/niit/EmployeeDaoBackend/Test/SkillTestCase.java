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
import com.niit.EmployeeDaoBackend.Model.Skill;
import com.niit.EmployeeDaoBackend.Service.SkillService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HibernateConfigFile.class) 
public class SkillTestCase {
@Autowired
	
	private SkillService skillservices;
	
	private Skill skill;
	@Before
	public void setUp() throws Exception {
		
		skill=new Skill();
	}

	@After
	public void tearDown() throws Exception {
	}

/*	
	
	@Test
	public void AddSkillss()
	{
		
		skill.setEmployeeid(106);
		skill.setEmployeename("mohan");
		skill.setSkillName("oraclese");
		skill.setCertification("oracle");
		skill.setStudentHandle(4);
		skill.setStudentPlaced(200);
		
		assertEquals("Success",true,skillservices.add(skill));
		
	}

	@Test
	public void getAllSkillTest()
	{
		List<Skill> skillList = new ArrayList<Skill>();
		//employeeList = empServices.getAll();
		
		skillList= skillservices.getAllSkill();
		
		System.out.println("Size of skilllist"+skillList);
		assertEquals("Success", true, skillList.size()!=0);
		
	}
	@Test
	public void deleteSkill()
	{
		assertEquals("NOT found",true,skillservices.delete(105));
	}*/
	
	/*@Test
	public void updateSkills() 
	{
		skill=skillservices.getUpdateId(106);
		skill.setStudentPlaced(5);
		
		assertEquals("Successfully Updated",true, skillservices.update(skill));
	}*/

}

