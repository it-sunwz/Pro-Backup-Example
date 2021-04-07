package com.its.bean;

import java.util.Date;
import java.util.List;

public class Task {
	
	private int task_id;
	
	private String task_name;
	
	private String task_type;
	
	private String task_description;
	
	private Date task_public_time;
	
	//员工的集合
	private List<Employee> employeeList;

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public String getTask_description() {
		return task_description;
	}

	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}

	public Date getTask_public_time() {
		return task_public_time;
	}

	public void setTask_public_time(Date task_public_time) {
		this.task_public_time = task_public_time;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Task [task_id=" + task_id + ", task_name=" + task_name + ", task_type=" + task_type
				+ ", task_description=" + task_description + ", task_public_time=" + task_public_time
				+ ", employeeList=" + employeeList + "]";
	}
	
	
}
