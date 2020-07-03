package com.iulia.recipes.domain;

import java.util.List;

public interface IngredientsDomainRepository {

	void save(Ingredient ingredient);

	List<String> getAllDb();
}
