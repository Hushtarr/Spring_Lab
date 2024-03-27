package org.spring.task1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor
    {
    private String name;
    private Gender gender;
    private  int age;
    }
