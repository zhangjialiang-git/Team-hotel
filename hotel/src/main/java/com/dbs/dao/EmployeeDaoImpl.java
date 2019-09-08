package com.dbs.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.dbs.pojo.Employee;

public class EmployeeDaoImpl extends SqlSessionDaoSupport implements EmployeeDao{


	@Override
	public Employee checkEmployee(Employee employee) {
		return this.getSqlSession().selectOne("com.dbs.pojo.EmployeeMapper.checkEmployee", employee);
	}

	@Override
	public int insertEmployee(Employee employee) {
		return this.getSqlSession().insert("com.dbs.pojo.EmployeeMapper.insertEmployee", employee);
	}

	@Override
	public int updateEmployee(Employee employee) {
		return this.getSqlSession().insert("com.dbs.pojo.EmployeeMapper.updateEmployee", employee);
	}

	@Override
	public int deleteEmployee(Employee employee) {
		return this.getSqlSession().insert("com.dbs.pojo.EmployeeMapper.deleteEmployee", employee);
	}

}

