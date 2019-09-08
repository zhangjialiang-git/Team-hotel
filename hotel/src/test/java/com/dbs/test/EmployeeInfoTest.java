package com.dbs.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.dbs.dao.EmployeeDao;
import com.dbs.pojo.Employee;

public class EmployeeInfoTest {
	
	@Test
	public void EmpCheckTest(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取applcationContext中配置的实例化Dao的容器
		EmployeeDao employeeDao = act.getBean(EmployeeDao.class);
		Employee emp = new Employee("zhangsan","123123",2);
		//使用EmployeeDaoImpl类中的方法
		Employee employee = employeeDao.checkEmployee(emp);
		System.out.println(employee);
	}
	
	@Test
	public void EmpRegisterTest(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取applcationContext中配置的实例化Dao的容器
		EmployeeDao employeeDao = act.getBean(EmployeeDao.class);
		Employee emp = new Employee("李四","lisi","567567",25,4);
		//使用EmployeeDaoImpl类中的方法
		int result = employeeDao.insertEmployee(emp);
		if(result!=0) {
		System.out.println("注册成功！");
		}else {
		System.out.println("注册失败！");
		}
	}
	
	@Test
	public void EmpUpdateTest(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取applcationContext中配置的实例化Dao的容器
		EmployeeDao employeeDao = act.getBean(EmployeeDao.class);
		Employee emp = new Employee(3,"李四",20);
		//使用EmployeeDaoImpl类中的方法
		int result = employeeDao.updateEmployee(emp);
		if(result!=0) {
		System.out.println("更新成功！");
		}else {
		System.out.println("更新失败！");
		}
	}
	
	@Test
	public void EmpDeleteTest(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取applcationContext中配置的实例化Dao的容器
		EmployeeDao employeeDao = act.getBean(EmployeeDao.class);
		Employee emp = new Employee(4);
		//使用EmployeeDaoImpl类中的方法
		int result = employeeDao.deleteEmployee(emp);
		if(result!=0) {
		System.out.println("删除成功！");
		}else {
		System.out.println("删除失败！");
		}
	}
	
	
	
}
