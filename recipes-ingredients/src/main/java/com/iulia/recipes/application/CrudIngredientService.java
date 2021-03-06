package com.iulia.recipes.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iulia.recipes.domain.Ingredient;
import com.iulia.recipes.domain.IngredientsDomainRepository;

@Service
public class CrudIngredientService {

	private IngredientsDomainRepository ingredientsDomainRepository;

	public CrudIngredientService(IngredientsDomainRepository ingredientsDomainRepository) {
		this.ingredientsDomainRepository = ingredientsDomainRepository;
	}

	public void save(Ingredient ingredient) {
		ingredientsDomainRepository.save(ingredient);
	}

	public List<String> getAllDb() {
		return ingredientsDomainRepository.getAllDb();
	}

}
