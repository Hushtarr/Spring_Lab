package org.spring.lab_04.model;


import lombok.Getter;
import lombok.Setter;
import org.spring.lab_04.enums.RecipeType;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Recipe
    {
    private UUID recipeId;
    private String name;
    private int duration;
    private String preparation;
    private List<Ingredient> ingredients;
    private RecipeType recipeType;
    }
