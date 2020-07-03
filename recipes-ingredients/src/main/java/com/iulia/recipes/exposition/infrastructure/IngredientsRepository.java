package com.iulia.recipes.exposition.infrastructure;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.iulia.recipes.domain.Ingredient;
import com.iulia.recipes.domain.IngredientsDomainRepository;

@Repository
@PropertySource({ "classpath:application.properties" })
public class IngredientsRepository implements IngredientsDomainRepository {
	private static final Logger LOGGER = LoggerFactory.getLogger(IngredientsRepository.class);
	private Database db;
	private CloudantClient client;
	private CloudantConfiguration configuration;

	public IngredientsRepository(CloudantConfiguration configuration) {
		this.configuration = configuration;
		db = this.configuration.cloudantDb();
		client = this.configuration.cloudantClient();
	}

	@Override
	public void save(Ingredient ingredient) {
		db.save(ingredient);
		LOGGER.info("Ingredient {} was saved", ingredient.getName());

	}

	@Override
	public List<String> getAllDb() {
		LOGGER.info("get all dbs");
		return client.getAllDbs();
	}

}
