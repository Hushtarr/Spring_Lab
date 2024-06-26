package org.spring.lab_04.service.shareService;

import org.spring.lab_04.model.Recipe;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("IG")
public class InstagramShareServiceImpl implements ShareService {
public boolean share(Recipe recipe) {
System.out.println("Shared on Instagram!");
System.out.println("RecipeType: " + recipe.getRecipeType());
System.out.println("Recipe Name: " + recipe.getName());
System.out.println("Recipe Duration: " + recipe.getDuration());
System.out.println("Ingredient List: ");

recipe.getIngredients().forEach(ingredients ->
        System.out.println("    Ingredient Name: " + ingredients.getName() + " Quantity: " +
                ingredients.getQuantity() + " " + ingredients.getQuantityType())
);

System.out.println("Preparation: \n" + "\t" + recipe.getPreparation());

return true;
}
}

