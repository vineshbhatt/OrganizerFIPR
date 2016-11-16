package com.tcs.contentorganizer.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.contentorganizer.controllers.CoController;
import com.tcs.contentorganizer.dao.DatabaseDAO;
import com.tcs.contentorganizer.dao.SolrDAO;

@Service
public class FolderMetadataService {

	@Autowired
	SolrDAO sdao;

	@Autowired
	DatabaseDAO dbdao;

	private static Logger LOGGER = Logger.getLogger(FolderMetadataService.class.getName());

	
}
