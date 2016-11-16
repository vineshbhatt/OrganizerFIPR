package com.tcs.contentorganizer.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.contentorganizer.dao.DatabaseDAO;
import com.tcs.contentorganizer.dao.SolrDAO;

@RestController
public class CoController {

	static Logger LOGGER = Logger.getLogger(CoController.class.getName());

	@Autowired
	DatabaseDAO dao;
	@Autowired
	SolrDAO sdao;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getQuery() {
		String output = null;		
//		long docList = this.sdao.getDocCountforActivity(1122, "3001_A");	
		this.dao.getActivityStatusFromActivityId(1122);
		return output;
	}

}
