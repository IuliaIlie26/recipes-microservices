package com.iulia.recipes.exposition.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudant.client.api.Database;
import com.iulia.recipes.domain.Ingredient;
import com.iulia.recipes.domain.IngredientsDomainRepository;

public class IngredientsRepository implements IngredientsDomainRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(IngredientsRepository.class);
	private Database db;

	@Override
	public void save(Ingredient ingredient) {
		db.save(ingredient);
		LOGGER.info("Ingredient {} was saved", ingredient.getName());

	}

}
