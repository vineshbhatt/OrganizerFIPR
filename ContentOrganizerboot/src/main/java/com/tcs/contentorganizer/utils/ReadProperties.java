package com.tcs.contentorganizer.utils;

import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

import org.springframework.stereotype.Service;

@Service
public class ReadProperties {

	private Properties Queries = new Properties();

	public Properties getQueries() {
		return Queries;
	}

	public void setQueries(Properties queries) {
		Queries = queries;
	}

	public ReadProperties() {
		ResourceBundle rb = ResourceBundle.getBundle("queries");
		Enumeration<String> keys = rb.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			Queries.setProperty(key, rb.getString(key));

		}
	}

}
