package org.spring.lab_04;

import org.spring.lab_04.service.recipeService.RecipeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab_04
    {
    public static void main(String[] args) {
    ApplicationContext container = SpringApplication.run(Lab_04.class, args);
    RecipeService recipeService = container.getBean(RecipeService.class);
    recipeService.prepareRecipe();

    /*RecipeCreatorConfig recipeCreatorConfig = container.getBean(RecipeCreatorConfig.class);
    System.out.println("recipeCreatorConfig.getFirstName() = " + recipeCreatorConfig.getFirstName());
    System.out.println("recipeCreatorConfig.getLastName() = " + recipeCreatorConfig.getLastName());*/
    }
    }
