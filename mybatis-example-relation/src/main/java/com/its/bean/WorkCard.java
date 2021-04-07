package com.its.bean;

import java.util.Date;
import java.util.List;
//������
public class WorkCard {
	//��������������Ա����������������
	private int id;
	//Ա�����
	private String cw_no;
	//���ڿ�����
	private String cw_attendance;
	//¼��ʱ��
	private Date cw_entertime;
	//Ա���� ����
	private Employee employee;
	//�򿨼�¼����
	private List<Record> recordList;
	
	public List<Record> getRecordList() {
		return recordList;
	}
	public void setRecordList(List<Record> recordList) {
		this.recordList = recordList;
	}
	
	
	@Override
	public String toString() {
		return "WorkCard [id=" + id + ", cw_no=" + cw_no + ", cw_attendance=" + cw_attendance + ", cw_entertime="
				+ cw_entertime + ", employee=" + employee + ", recordList=" + recordList + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String getCw_no() {
		return cw_no;
	}
	public void setCw_no(String cw_no) {
		this.cw_no = cw_no;
	}
	public String getCw_attendance() {
		return cw_attendance;
	}
	public void setCw_attendance(String cw_attendance) {
		this.cw_attendance = cw_attendance;
	}
	public Date getCw_entertime() {
		return cw_entertime;
	}
	public void setCw_entertime(Date cw_entertime) {
		this.cw_entertime = cw_entertime;
	}
	
	
}
