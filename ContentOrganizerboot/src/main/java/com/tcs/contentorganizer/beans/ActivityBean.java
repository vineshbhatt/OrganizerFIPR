package com.tcs.contentorganizer.beans;

import java.util.Date;

public class ActivityBean {

	int activityId;
	String activityName = "";
	String owner = "";
	String fileShareName = "";
	String location = "";
	String status = "";
	Date startDate;
	Date endDate;
	long totaldoccount = 0;

	

	public int getActivityId() {
		return activityId;
	}

	public long getTotaldoccount() {
		return totaldoccount;
	}

	public void setTotaldoccount(long totaldoccount) {
		this.totaldoccount = totaldoccount;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getFileShareName() {
		return fileShareName;
	}

	public void setFileShareName(String fileShareName) {
		this.fileShareName = fileShareName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
