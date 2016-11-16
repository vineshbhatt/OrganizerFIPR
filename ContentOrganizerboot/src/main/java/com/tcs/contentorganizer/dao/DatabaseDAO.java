package com.tcs.contentorganizer.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.tcs.contentorganizer.beans.ActivityBean;
import com.tcs.contentorganizer.beans.FileShareBean;
import com.tcs.contentorganizer.mapper.ActivityRowMapper;
import com.tcs.contentorganizer.mapper.FileShareRowMapper;
import com.tcs.contentorganizer.utils.ReadProperties;

@Service
public class DatabaseDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	ReadProperties readprop;

	public ArrayList<ActivityBean> getActivityList(String fileShareName) {
		ArrayList<ActivityBean> activities = (ArrayList<ActivityBean>) jdbcTemplate.query(
				readprop.getQueries().getProperty("getactivities"), new Object[] { fileShareName.toUpperCase() },
				new ActivityRowMapper());
		return activities;
	}

	public ArrayList<FileShareBean> getAllFileShareDetails() {
		ArrayList<FileShareBean> fsdetails = (ArrayList<FileShareBean>) jdbcTemplate
				.query(readprop.getQueries().getProperty("getallfsdetails"), new Object[] {}, new FileShareRowMapper());
		return fsdetails;
	}

	public FileShareBean getFileShareDetails(String fileShareName) {
		ArrayList<FileShareBean> fsdetails = (ArrayList<FileShareBean>) jdbcTemplate.query(
				readprop.getQueries().getProperty("getfsdetails"), new Object[] { fileShareName.toUpperCase() },
				new FileShareRowMapper());
		return fsdetails.get(0);
	}

	public ActivityBean getActivityStatusFromActivityId(int activityId) {

		ArrayList<ActivityBean> activities = (ArrayList<ActivityBean>) jdbcTemplate.query(
				readprop.getQueries().getProperty("getactvitydetailsforactvityid"), new Object[] { activityId },
				new ActivityRowMapper());
		return activities.get(0);
	}

}
