package com.tcs.contentorganizer.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.contentorganizer.beans.ActivityBean;

public class ActivityRowMapper implements RowMapper 
{
	
	@Override
	public Object mapRow(ResultSet rs, int rownum) throws SQLException 
	{
		ActivityBean activity = new ActivityBean();
		if(rs.getInt("activity_id")!=0){
			activity.setActivityId(rs.getInt("activity_id"));
		}
		if(rs.getString("activity_name")!=null && !rs.getString("activity_name").trim().equals("")){
			activity.setActivityName(rs.getString("activity_name"));
		}
		if(rs.getString("activity_owner")!=null && !rs.getString("activity_owner").trim().equals("")){
			activity.setOwner(rs.getString("activity_owner"));
		}
		if(rs.getString("file_share_name")!=null && !rs.getString("file_share_name").trim().equals("")){
			activity.setFileShareName(rs.getString("file_share_name"));
		}
		if(rs.getString("location")!=null && !rs.getString("location").trim().equals("")){
			activity.setLocation(rs.getString("location"));
		}
		if(rs.getString("status")!=null && !rs.getString("status").trim().equals("")){
			activity.setStatus(rs.getString("status"));
		}
		if(rs.getDate("start_time")!=null ){
			activity.setStartDate(rs.getDate("start_time"));
		}
		if(rs.getDate("end_time")!=null ){
			activity.setEndDate(rs.getDate("end_time"));
		}
		return activity;
	}

}
