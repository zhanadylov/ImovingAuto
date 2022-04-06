package com.imoving.UI;

import com.github.javafaker.Faker;

public class JavaFaker {
    public static void main(String[] args) {
        Faker faker = new Faker();
         String firstName = faker.name().firstName();
        System.out.println(firstName);
        String lastName = faker.name().lastName();
        System.out.println(lastName);
        String email = faker.internet().emailAddress();
        System.out.println(email);
        String test = faker.chuckNorris().fact();
        System.out.println(test);
        String a = faker.address().city();
        String v = faker.animal().name();


    }
}
