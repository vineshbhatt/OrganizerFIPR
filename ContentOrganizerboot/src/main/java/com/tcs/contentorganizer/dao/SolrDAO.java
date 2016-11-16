package com.tcs.contentorganizer.dao;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.query.PartialUpdate;
import org.springframework.stereotype.Service;

import com.tcs.contentorganizer.impls.SolritemRepositoryImpl;

@Service
public class SolrDAO {

	@Autowired
	DatabaseDAO dbdao;

	@Autowired
	SolritemRepositoryImpl simpl;

	@Resource
	SolrQuery solrquery;

	private static Logger LOGGER = Logger.getLogger(SolrDAO.class.getName());

	public long getDocCountforActivity(Integer activityid, String fileShareName) {
		// SolrQuery solrquery = new SolrQuery();
		solrquery.set("q", "{!join from=id to=parent_s}activity_id_s:" + activityid);
		solrquery.set("fl", "id");
		solrquery.addFilterQuery("type_s:FILE");
		long count = simpl.getCount(solrquery, dbdao.getFileShareDetails(fileShareName).getFileShareCoreName());
		return count;
	}

	public Boolean updateRetain(Integer activityid, String folderId, String fileShareName, String status,
			String retainReason) {
		LOGGER.log(Level.INFO, "Insdie updateRetain :Parameters activityid:" + activityid + ",folderId:" + folderId
				+ ",fileShareName:" + fileShareName + ",status:" + status + ",retainReason:" + retainReason);

		PartialUpdate folderupdate = new PartialUpdate("id", folderId);
		folderupdate.setValueOfField("retain_reason_s", retainReason);
		folderupdate.setValueOfField("retain_s", status.toUpperCase());
		if (!status.equalsIgnoreCase("Y")) {
			folderupdate.setValueOfField("legal_hold_lastupdated_s",
					new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date()));
		}

		try {
			simpl.updateSolrValue(folderupdate, dbdao.getFileShareDetails(fileShareName).getFileShareCoreName());
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage().toString());
			return false;
		}

		LOGGER.log(Level.INFO, "Update Retain Execution Completed");
		return true;
	}

}
