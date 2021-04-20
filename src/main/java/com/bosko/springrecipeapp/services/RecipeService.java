package com.bosko.springrecipeapp.services;

import com.bosko.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
