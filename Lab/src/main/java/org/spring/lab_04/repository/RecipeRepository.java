package org.spring.lab_04.repository;

import org.spring.lab_04.model.Recipe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component

public class RecipeRepository implements Repository
    {
    List<Recipe> recipeList=new ArrayList<>();
    @Override
    public boolean save(Recipe recipe)
        {
        return recipeList.add(recipe);
        }
    }
