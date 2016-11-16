package com.tcs.contentorganizer.repositories;

import java.util.HashMap;
import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.data.solr.core.query.PartialUpdate;

import com.tcs.contentorganizer.beans.Solritem;

public interface CustomCORepository {

	HashMap<String, Solritem> executeQuery(SolrQuery sq, String solrCorename);

	boolean updateSolrValue(PartialUpdate cobean, String solrCorename);

	List<String> executeQueryForList(SolrQuery sq, String solrCorename);

	long getCount(SolrQuery sq, String solrCorename);
	
	boolean deleteById()
;		

}
