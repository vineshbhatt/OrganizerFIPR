package com.tcs.contentorganizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.tcs.contentorganizer.config.SolrConfig;

@SpringBootApplication
@Import(SolrConfig.class)
public class ContentOrganizerbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentOrganizerbootApplication.class, args);

	}
}
