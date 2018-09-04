package com.niit.EmployeeDaoBackend.Dao;

import java.util.List;

import com.niit.EmployeeDaoBackend.Model.Skill;

public interface SkillDao {
	public boolean add(Skill skill);
	public boolean deleteSkill(int employeeid);
	
	public boolean update(Skill employee);	
	public Skill getUpdateId(int employeeid);
	public Skill getEmployeebyId(int employeeid);
	List<Skill> getAllSkill();
	}
