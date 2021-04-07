package com.its.bean;

import java.util.Date;
import java.util.List;
//员工表
public class Employee {
	//员工表主键
	private int id;
	//姓名
	private String name;
	//入职时间
	private Date entryTime;
	//薪资
	private int wage;
	//奖金
	private int bonus;
	//工卡表 对象
	private WorkCard workCard;
	//任务表集合
	private List<Task> taskList;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", entryTime=" + entryTime + ", wage=" + wage + ", bonus="
				+ bonus + ", workCard=" + workCard + ", taskList=" + taskList + "]";
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public WorkCard getWorkCard() {
		return workCard;
	}
	public void setWorkCard(WorkCard workCard) {
		this.workCard = workCard;
	}
	
	
	
}
