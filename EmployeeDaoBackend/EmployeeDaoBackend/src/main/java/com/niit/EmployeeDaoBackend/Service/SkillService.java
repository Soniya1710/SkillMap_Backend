package com.niit.EmployeeDaoBackend.Service;

import java.util.List;

import com.niit.EmployeeDaoBackend.Model.Skill;

public interface SkillService {
	public boolean add(Skill skill);
	public boolean delete(int employeeid);
	public boolean update(Skill employee);
	public Skill getUpdateId(int employeeid);
	List<Skill> getAllSkill();// view all records
	public Skill getEmployeebyId(int employeeid);
	
}
