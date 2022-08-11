package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{
    @Value("${lion.breed}")
    private String breed;
    @Value("${lion.color}")
    private String color;
    @Value("${lion.age}")
    private int age;



    @Override
    public void animalPlus() {
        System.out.println("Lion is hunting");

    }

    @Override
    public void animalMinus() {
        System.out.println("Lion is attacking");

    }
}
