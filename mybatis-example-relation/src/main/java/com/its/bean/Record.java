package com.its.bean;

import java.util.Date;

public class Record {
	
	private int record_id;
	
	private String record_pos_name;
	
	private Date record_time;
	//记录数据对应的工卡
	private WorkCard workCard;
	
	public int getRecord_id() {
		return record_id;
	}
	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}
	public String getRecord_pos_name() {
		return record_pos_name;
	}
	public void setRecord_pos_name(String record_pos_name) {
		this.record_pos_name = record_pos_name;
	}
	public Date getRecord_time() {
		return record_time;
	}
	public void setRecord_time(Date record_time) {
		this.record_time = record_time;
	}
	public WorkCard getWorkCard() {
		return workCard;
	}
	public void setWorkCard(WorkCard workCard) {
		this.workCard = workCard;
	}
	@Override
	public String toString() {
		return "Record [record_id=" + record_id + ", record_pos_name=" + record_pos_name + ", record_time="
				+ record_time + ", workCard=" + workCard + "]";
	}
	
	
}
