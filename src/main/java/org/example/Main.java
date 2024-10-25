package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertPetsToSound(make3pets())));


    }

    public static Pet[] make3pets() {
        Pet[] pets = {new Cat("Kuzya"),
                new Cat("Vaska"),
                new Dog("Polkan")
        };
        return pets;
    }

    public static String[] convertPetsToSound(Pet[] pets) {
        return Arrays.stream(pets).map(Pet::makeSound).toArray(String[]::new);
    }
//        String [] sound = new String[pets.length];

//        for (int i = 0; i < pets.length; i++) {
//            sound[i] = pets[i].makeSound();
//        }
//        return sound;

}




