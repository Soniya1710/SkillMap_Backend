package com.niit.EmployeeDaoBackend.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EmployeeDaoBackend.Model.Skill;

@Repository("SkillDao")
@Transactional
public class SkillDaoImpl implements SkillDao{
@Autowired
private SessionFactory sessionFact;
private boolean b = true;
public boolean add(Skill skill) {
		
	sessionFact.getCurrentSession().save(skill);
	return true;
	}

	public boolean deleteSkill(int employeeid) {
		Skill emp1=getEmployeebyId(employeeid);
		if(emp1!=null)
		{
			sessionFact.getCurrentSession().delete(emp1);
				return true;
		}
		else
			return false;
	}
	public boolean update(Skill employee) {
		sessionFact.getCurrentSession().update(employee);
		return true;
	}

	public Skill getUpdateId(int employeeid) {
		return sessionFact.getCurrentSession().get(Skill.class,employeeid);
		
	}

	public Skill getEmployeebyId(int employeeid) {
		return (Skill)sessionFact.getCurrentSession().createQuery("from Skill where employeeid="+employeeid).uniqueResult();
		
	}

	public List<Skill> getAllSkill() {
		return (List<Skill>) sessionFact.getCurrentSession().createCriteria(Skill.class).list();
	}

}
