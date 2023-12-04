package com.learn.project1.HibernateProject2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class student1 {
	@Id
	int rollno;
	String name;
	int age;
	@OneToOne
	bike bk;
	public student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student1(int rollno, String name, int age, bike bk) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.bk = bk;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public bike getBk() {
		return bk;
	}
	public void setBk(bike bk) {
		this.bk = bk;
	}
	
}
