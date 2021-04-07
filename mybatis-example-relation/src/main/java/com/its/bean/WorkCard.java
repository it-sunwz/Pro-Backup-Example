package com.its.bean;

import java.util.Date;
import java.util.List;
//工卡表
public class WorkCard {
	//工卡的主键就是员工表的主键做的外键
	private int id;
	//员工编号
	private String cw_no;
	//考勤卡机号
	private String cw_attendance;
	//录卡时间
	private Date cw_entertime;
	//员工表 对象
	private Employee employee;
	//打卡记录集合
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
