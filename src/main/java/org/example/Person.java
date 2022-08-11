package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;

    public Person() {
    }
@Autowired
    public Person(@Qualifier("lion") Animal animal) {
        this.animal = animal;
    }

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void callYourPet(){
        animal.animalMinus();
        animal.animalPlus();
        System.out.println(getName()+ " is " + getAge() + " years old.");
    }
    @PostConstruct
    public void init (){
        System.out.println("Person class's init method");

    }
    @PreDestroy
    public void destroy() {
        System.out.println("Person class's destroyed method");
    }
}
