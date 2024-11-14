package com.fsdproject.receipe.service;

import java.util.List;

import com.fsdproject.receipe.exception.RecipeException;
import com.fsdproject.receipe.model.User;
import com.fsdproject.receipe.model.Recipe;

public interface RecipeService {
	
	public Recipe createRecipe(Recipe recipe, User user);
	
	public Recipe findRecipeById(Long id) throws RecipeException;
	
	public void deleteRecipe(Long id) throws RecipeException;
	
	public Recipe updateRecipe(Recipe recipe,Long id) throws RecipeException;
	
	public List<Recipe> findAllRecipe();
	
	public Recipe likeRecipe(Long recipeId,User user) throws RecipeException;

}
