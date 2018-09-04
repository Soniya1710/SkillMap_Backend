package com.niit.EmployeeDaoBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.EmployeeDaoBackend.Dao.SkillDao;
import com.niit.EmployeeDaoBackend.Model.Skill;
@Service
public class SkillServiceImpl implements SkillService{
	@Autowired
	private SkillDao skillDAO;
	public boolean add(Skill skill) {
		// TODO Auto-generated method stub
		return skillDAO.add(skill);
	}

	public boolean delete(int employeeid) {
		// TODO Auto-generated method stub
		return (skillDAO.deleteSkill(employeeid));	
	}

	public boolean update(Skill employee) {
		// TODO Auto-generated method stub
		return skillDAO.update(employee);
	}

	public Skill getUpdateId(int employeeid) {
		// TODO Auto-generated method stub
		return(skillDAO.getUpdateId(employeeid));
	}

	public List<Skill> getAllSkill() {
		// TODO Auto-generated method stub
		return skillDAO.getAllSkill();
	}

	public Skill getEmployeebyId(int employeeid) {
		// TODO Auto-generated method stub
		return(skillDAO.getEmployeebyId(employeeid));	
	}

}
