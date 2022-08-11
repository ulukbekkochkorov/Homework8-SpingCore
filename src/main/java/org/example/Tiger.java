package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal{
    @Value("${tiger.breed}")
        private String breed;
    @Value("${tiger.color}")
    private String color;

       @Override
    public void animalPlus() {
        System.out.println("Tiger is hunting");

    }

    @Override
    public void animalMinus() {
        System.out.println("Tiger is attacking");

    }
}
