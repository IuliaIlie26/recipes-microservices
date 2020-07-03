package com.iulia.recipes.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredientsDto {

	@JsonProperty
	public String name;
	@JsonProperty
	public Double caloriesCount;
	@JsonProperty
	public String id;
}
