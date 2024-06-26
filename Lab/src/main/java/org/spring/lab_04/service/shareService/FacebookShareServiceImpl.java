package org.spring.lab_04.service.shareService;

import org.spring.lab_04.model.Recipe;
import org.springframework.stereotype.Component;

@Component
public class FacebookShareServiceImpl implements ShareService
    {
@Override
public boolean share(Recipe recipe) {

System.out.println("Shared on Facebook!");
System.out.println("RecipeType: " + recipe.getRecipeType());
System.out.println("Recipe Name: " + recipe.getName());
System.out.println("Recipe Duration: " + recipe.getDuration());
System.out.println("Ingredient List: ");

recipe.getIngredients().forEach(ingredients
        -> System.out.println("    Ingredient Name: "
        +ingredients.getName() + " Quantity: " + ingredients.getQuantity() +
        " " + ingredients.getQuantityType())
);

System.out.println("Preparation: \n" + "\t" + recipe.getPreparation());

return true;
}
}
