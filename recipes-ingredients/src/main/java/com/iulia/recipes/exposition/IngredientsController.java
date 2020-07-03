package com.iulia.recipes.exposition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iulia.recipes.application.CrudIngredientService;
import com.iulia.recipes.domain.Ingredient;


@RestController
public class IngredientsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IngredientsController.class);

	private IngredientsMapperService ingredientsMapperService;
	private CrudIngredientService crudIngredientService;

	public IngredientsController(IngredientsMapperService ingredientsMapperService,
			CrudIngredientService crudIngredientService) {
		this.ingredientsMapperService = ingredientsMapperService;
		this.crudIngredientService = crudIngredientService;
	}

	@PostMapping("/ingredient")
	public ResponseEntity<Void> save(@RequestBody IngredientsDto dto) {

		LOGGER.info("Processing create ingredient request for: {}", dto.name);
		Ingredient ingredient = ingredientsMapperService.mapFromDto(dto);
		crudIngredientService.save(ingredient);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
