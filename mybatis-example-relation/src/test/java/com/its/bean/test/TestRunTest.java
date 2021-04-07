package com.its.bean.test;

import org.junit.Test;

import com.its.bean.Employee;
import com.its.utils.DbUtils;

public class TestRunTest {
	
	//测试根据ID查询数据
	@Test
	public void ts01() {
		Employee employee = DbUtils.getSession().selectOne("selectEmployeeById", 1);
		System.out.println(employee);
	}
	//测试根据-2
	@Test
	public void ts02() {
		Employee employee = DbUtils.getSession().selectOne("selectEmployeeById-2", 1);
		System.out.println(employee);
	}
	
	// 查询员工ID为1的员工的任务有哪些
	@Test
	public void ts03() {
		Employee employee = DbUtils.getSession().selectOne("selectEmployeeTask", 1);
		System.out.println(employee);
	}
}
