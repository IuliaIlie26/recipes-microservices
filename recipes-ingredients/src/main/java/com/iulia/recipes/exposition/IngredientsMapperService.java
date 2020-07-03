package com.iulia.recipes.exposition;

import com.iulia.recipes.domain.Ingredient;

public class IngredientsMapperService {

	public IngredientsDto mapFromDomain(Ingredient bean) {
		IngredientsDto dto = new IngredientsDto();
		dto.caloriesCount = bean.getCaloriesCount();
		dto.name = bean.getName();
		dto.id= bean.getId();
		return dto;
	}

	public Ingredient mapFromDto(IngredientsDto dto) {

		return new Ingredient(dto.name, dto.caloriesCount);
	}

}
