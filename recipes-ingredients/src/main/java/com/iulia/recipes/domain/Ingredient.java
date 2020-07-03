package com.iulia.recipes.domain;

public class Ingredient {

	private String _id;
	private String _rev;
	private String name;
	private Double caloriesCount;

	public Ingredient(String name, Double caloriesCount) {
		this.name = name;
		this.caloriesCount = caloriesCount;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return _id;
	}

	public Double getCaloriesCount() {
		return caloriesCount;
	}

}
