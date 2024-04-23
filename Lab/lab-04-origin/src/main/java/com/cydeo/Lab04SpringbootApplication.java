package com.cydeo;

import com.cydeo.config.RecipeCreatorConfig;
import com.cydeo.service.RecipeService;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab04SpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(Lab04SpringbootApplication.class, args);

        RecipeService recipeService = container.getBean(RecipeService.class);

        recipeService.prepareRecipe();

        RecipeCreatorConfig recipeCreatorConfig = container.getBean(RecipeCreatorConfig.class);
        System.out.println("recipeCreatorConfig.getFirstName() = " + recipeCreatorConfig.getFirstName());
        System.out.println("recipeCreatorConfig.getLastName() = " + recipeCreatorConfig.getLastName());
    }

}
