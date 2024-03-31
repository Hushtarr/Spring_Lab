package org.spring.test3;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data

public class NewCharacter
    {
    public String firstname= new Faker().name().firstName();
    public String lastname=new Faker().name().lastName();;
    public String country=new Faker().country().name();

    }
