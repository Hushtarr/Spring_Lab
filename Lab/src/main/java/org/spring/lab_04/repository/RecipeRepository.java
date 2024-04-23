package org.spring.lab_04.repository;

import org.spring.lab_04.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeRepository implements Repository
    {
    List<Recipe> recipeList=new ArrayList<>();
    @Override
    public boolean saveRecipe(Recipe recipe)
        {
        recipeList.add(recipe);
        return true;
        }
    }
