package org.example;

import java.util.Objects;

public abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}


