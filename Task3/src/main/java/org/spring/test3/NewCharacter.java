package org.spring.test3;

import com.github.javafaker.Faker;
import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Getter
@Setter

public class NewCharacter
    {
        public String firstname,lastname,country;
    public NewCharacter()
        {
        this.firstname = new Faker().name().firstName();
        this.lastname = new Faker().name().lastName();
        this.country = new Faker().country().name();
        }
    }
