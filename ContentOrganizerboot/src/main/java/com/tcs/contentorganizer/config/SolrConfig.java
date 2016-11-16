package com.tcs.contentorganizer.config;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

import com.tcs.contentorganizer.repositories.CustomCORepository;

@Configuration
@EnableSolrRepositories(basePackageClasses = CustomCORepository.class, multicoreSupport = true)
public class SolrConfig {

	@Bean
	public SolrClient solrClient(@Value("${solr.server.url}") String solrHost) {
		return new HttpSolrClient(solrHost);
	}

	@Bean
	public SolrTemplate solrTemplate(SolrClient solrServer) {

		return new SolrTemplate(solrServer);
	}

	@Bean
	public SolrQuery solrquery() {

		return new SolrQuery();
	}

}
