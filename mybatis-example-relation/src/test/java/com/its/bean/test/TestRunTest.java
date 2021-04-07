package com.its.bean.test;

import org.junit.Test;

import com.its.bean.Employee;
import com.its.utils.DbUtils;

public class TestRunTest {
	
	//���Ը���ID��ѯ����
	@Test
	public void ts01() {
		Employee employee = DbUtils.getSession().selectOne("selectEmployeeById", 1);
		System.out.println(employee);
	}
	//���Ը���-2
	@Test
	public void ts02() {
		Employee employee = DbUtils.getSession().selectOne("selectEmployeeById-2", 1);
		System.out.println(employee);
	}
	
	// ��ѯԱ��IDΪ1��Ա������������Щ
	@Test
	public void ts03() {
		Employee employee = DbUtils.getSession().selectOne("selectEmployeeTask", 1);
		System.out.println(employee);
	}
}
