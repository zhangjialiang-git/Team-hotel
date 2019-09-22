package com.dbs.entity;

import java.util.Date;

public class EmpInfo {
	private int e_id;		
	private String name;
	private String username;
	private String password;
	private int age;
	private int j_id;
	private String j_name;
	private Date hiredate;
	
	
	
	public String getJ_name() {
		return j_name;
	}

	public void setJ_name(String j_name) {
		this.j_name = j_name;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public EmpInfo() {
		super();
	}
	
	//
	public EmpInfo(int e_id) {
		super();
		this.e_id = e_id;
	}
	
	//查询专用
	public EmpInfo(String username,String password,int j_id) {
		super();
		this.username = username;
		this.password = password;
		this.j_id = j_id;
	}
	
	//更新专用
	public EmpInfo(int e_id,String name,int age) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.age = age;
	}
	
	//注册专用
	public EmpInfo(String name,String username,String password,int age,int j_id) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.j_id = j_id;
		this.age = age;
	}
	
	
	public int getJ_id() {
		return j_id;
	}

	public void setJ_id(int j_id) {
		this.j_id = j_id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
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
	public int getJob() {
		return j_id;
	}
	public void setJob(int j_id) {
		this.j_id = j_id;
	}
	
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", age=" + age + ", j_id=" + j_id + "]";
	}
	
	
	
	
}
