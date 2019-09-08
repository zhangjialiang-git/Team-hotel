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
		//��ȡapplcationContext�����õ�ʵ����Dao������
		EmployeeDao employeeDao = act.getBean(EmployeeDao.class);
		Employee emp = new Employee("zhangsan","123123",2);
		//ʹ��EmployeeDaoImpl���еķ���
		Employee employee = employeeDao.checkEmployee(emp);
		System.out.println(employee);
	}
	
	@Test
	public void EmpRegisterTest(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡapplcationContext�����õ�ʵ����Dao������
		EmployeeDao employeeDao = act.getBean(EmployeeDao.class);
		Employee emp = new Employee("����","lisi","567567",25,4);
		//ʹ��EmployeeDaoImpl���еķ���
		int result = employeeDao.insertEmployee(emp);
		if(result!=0) {
		System.out.println("ע��ɹ���");
		}else {
		System.out.println("ע��ʧ�ܣ�");
		}
	}
	
	@Test
	public void EmpUpdateTest(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡapplcationContext�����õ�ʵ����Dao������
		EmployeeDao employeeDao = act.getBean(EmployeeDao.class);
		Employee emp = new Employee(3,"����",20);
		//ʹ��EmployeeDaoImpl���еķ���
		int result = employeeDao.updateEmployee(emp);
		if(result!=0) {
		System.out.println("���³ɹ���");
		}else {
		System.out.println("����ʧ�ܣ�");
		}
	}
	
	@Test
	public void EmpDeleteTest(){
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡapplcationContext�����õ�ʵ����Dao������
		EmployeeDao employeeDao = act.getBean(EmployeeDao.class);
		Employee emp = new Employee(4);
		//ʹ��EmployeeDaoImpl���еķ���
		int result = employeeDao.deleteEmployee(emp);
		if(result!=0) {
		System.out.println("ɾ���ɹ���");
		}else {
		System.out.println("ɾ��ʧ�ܣ�");
		}
	}
	
	
	
}
