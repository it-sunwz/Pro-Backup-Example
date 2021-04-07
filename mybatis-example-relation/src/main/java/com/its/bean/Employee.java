package com.its.bean;

import java.util.Date;
import java.util.List;
//Ա����
public class Employee {
	//Ա��������
	private int id;
	//����
	private String name;
	//��ְʱ��
	private Date entryTime;
	//н��
	private int wage;
	//����
	private int bonus;
	//������ ����
	private WorkCard workCard;
	//�������
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
