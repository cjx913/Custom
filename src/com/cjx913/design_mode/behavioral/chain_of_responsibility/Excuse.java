package com.cjx913.design_mode.behavioral.chain_of_responsibility;

import java.util.Date;
import java.util.Set;

import com.cjx913.design_mode.behavioral.chain_of_responsibility.staff.Staff;

public class Excuse {
	private String id;
	private Staff employee;
	private Date startDate;
	private Date endDate;
	private String reason;
	private Set<Image> evidences;
	
	public Excuse(String id, Staff employee, Date startDate, Date endDate, String reason, Set<Image> evidences) {
		super();
		this.id = id;
		this.employee = employee;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reason = reason;
		this.evidences = evidences;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Staff getEmployee() {
		return employee;
	}
	public void setEmployee(Staff employee) {
		this.employee = employee;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Set<Image> getEvidences() {
		return evidences;
	}
	public void setEvidences(Set<Image> evidences) {
		this.evidences = evidences;
	}
	
	public long excuseDaies() {
		long day = (this.getEndDate().getTime()-this.getStartDate().getTime())/(24*60*60*1000);
		return day;
	}
	
	
	
}
