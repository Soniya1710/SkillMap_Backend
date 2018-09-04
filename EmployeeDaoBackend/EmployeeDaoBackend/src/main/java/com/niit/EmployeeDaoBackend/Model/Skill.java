package com.niit.EmployeeDaoBackend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="skillmap")
@Entity
public class Skill {
	@Id
	private int employeeid;
	@Column(nullable=false)
	private String employeename;
	@Column(nullable=false)
	private String skillName;
	@Column(nullable=false)
	private String certification;
	@Column(nullable=false)
	private int studentHandle;
	@Column(nullable=false)
	private int studentPlaced;	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public int getStudentHandle() {
		return studentHandle;
	}
	public void setStudentHandle(int studentHandle) {
		this.studentHandle = studentHandle;
	}
	public int getStudentPlaced() {
		return studentPlaced;
	}
	public void setStudentPlaced(int studentPlaced) {
		this.studentPlaced = studentPlaced;
	}
		}
 

