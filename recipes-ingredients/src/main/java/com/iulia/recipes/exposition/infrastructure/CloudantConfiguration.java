package com.iulia.recipes.exposition.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;

@Configuration
public class CloudantConfiguration {

	@Autowired
	private Environment env;

	@Bean(name = "cloudantClient")
	public CloudantClient cloudantClient() {

		return ClientBuilder.account(env.getProperty("cloudant.account"))
				.iamApiKey(env.getProperty("cloudant.iamApiKey")).build();
	}

	@Bean(name = "cloudantDb")
	public Database cloudantDb() {
		return ClientBuilder.account(env.getProperty("cloudant.account"))
				.iamApiKey(env.getProperty("cloudant.iamApiKey")).build()
				.database(env.getProperty("cloudant.dbName"), true);
	}

}
