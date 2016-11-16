package com.tcs.contentorganizer.service;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.contentorganizer.beans.ActivityBean;
import com.tcs.contentorganizer.dao.DatabaseDAO;
import com.tcs.contentorganizer.dao.SolrDAO;

@Service
public class ActivityDetailsService {

	@Autowired
	SolrDAO sdao;

	@Autowired
	DatabaseDAO dbdao;

	private static Logger LOGGER = Logger.getLogger(ActivityDetailsService.class.getName());

	public ArrayList<ActivityBean> getActivityDetailsofFileShare(String fileShareName) {

		ArrayList<ActivityBean> activityDetails = this.dbdao.getActivityList(fileShareName);
		for (ActivityBean activity : activityDetails) {
			activity.setTotaldoccount(
					this.sdao.getDocCountforActivity(activity.getActivityId(), activity.getFileShareName()));
		}
		return activityDetails;
	}

}
