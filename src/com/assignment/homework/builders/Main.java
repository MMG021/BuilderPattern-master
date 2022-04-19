package com.assignment.homework.builders;

import com.assignment.homework.builders.Director;
import com.assignment.homework.builders.KittenBuilder;
import com.assignment.homework.builders.Animal;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        KittenBuilder builder = new KittenBuilder();
        director.makeMonkey(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Animal animal = builder.getResult();
        System.out.println("Car built:\n" + animal.toString());
        System.out.println("------------------------------------------------------");

        // Director may know several building recipes.

    }
}
