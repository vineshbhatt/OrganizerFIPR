package com.tcs.contentorganizer.impls;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.PartialUpdate;
import org.springframework.stereotype.Repository;

import com.tcs.contentorganizer.beans.Solritem;
import com.tcs.contentorganizer.repositories.CustomCORepository;

@Repository
public class SolritemRepositoryImpl implements CustomCORepository {

	@Value("${solr.server.url}")
	private String solrHost;

	@Resource
	private SolrClient solrClient;

	@Resource
	private SolrTemplate solrTemplate;

	public void setUpCoreForSolr(String coreName) {
		solrClient = new HttpSolrClient(solrHost);
		solrTemplate = new SolrTemplate(solrClient, coreName);
		solrTemplate.afterPropertiesSet();
	}

	@Override
	public HashMap<String, Solritem> executeQuery(SolrQuery sq, String solrCorename) {

		setUpCoreForSolr(solrCorename);
		HashMap<String, Solritem> docs = new HashMap<>();

		try {
			QueryResponse q = solrTemplate.getSolrClient().query(sq);
			List<Solritem> solrResults = solrTemplate.convertSolrDocumentListToBeans(q.getResults(), Solritem.class);
			for (Solritem soitem : solrResults) {
				docs.put(soitem.getId(), soitem);
			}

		} catch (Exception ex) {

		}

		return docs;
	}

	@Override
	public boolean updateSolrValue(PartialUpdate cobean, String solrCorename) {
		setUpCoreForSolr(solrCorename);
		try {
			solrTemplate.saveBean(cobean);
			solrTemplate.commit();
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	@Override
	public List<String> executeQueryForList(SolrQuery sq, String solrCorename) {

		setUpCoreForSolr(solrCorename);
		try {
			QueryResponse q = solrTemplate.getSolrClient().query(sq);
			List<Solritem> solrResults = solrTemplate.convertSolrDocumentListToBeans(q.getResults(), Solritem.class);
		} catch (Exception ex) {
		}
		return null;
	}

	@Override
	public long getCount(SolrQuery sq, String solrCorename) {

		setUpCoreForSolr(solrCorename);
		try {
			QueryResponse q = solrTemplate.getSolrClient().query(sq);
			return q.getResults().getNumFound();
		} catch (Exception ex) {
			// TODO: handle exception
		}
		return 0;

	}

	@Override
	public boolean deleteById() {
		// TODO Auto-generated method stub
		return false;
	}

}
