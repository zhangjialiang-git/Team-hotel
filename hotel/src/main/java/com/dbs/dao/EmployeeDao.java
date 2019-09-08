package com.dbs.dao;

import com.dbs.pojo.Employee;

public interface EmployeeDao {
		
	public Employee checkEmployee(Employee employee);
	
	public int insertEmployee(Employee employee);
	
	public int updateEmployee(Employee employee);
	
	public int deleteEmployee(Employee employee);
}
