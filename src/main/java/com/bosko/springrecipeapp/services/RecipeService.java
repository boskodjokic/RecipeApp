package com.bosko.springrecipeapp.services;

import com.bosko.springrecipeapp.commands.RecipeCommand;
import com.bosko.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long id);
    void deleteById(Long idToDelete);
}
