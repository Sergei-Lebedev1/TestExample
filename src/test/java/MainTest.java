import org.example.Cat;
import org.example.Dog;
import org.example.Main;
import org.example.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void make3pets() {
        Pet[] actualPets = Main.make3pets();
        Pet[] expectedPets = {new Cat("Kuzya"),
                new Cat("Vaska"),
                new Dog("Polkan")
        };
        Assertions.assertArrayEquals(expectedPets, actualPets);
    }

    @Test
    public void testConvertPetsToSound() {
        Pet[] pets = Main.make3pets();
        String[] actualSound = Main.convertPetsToSound(pets);
        String[] expectedSound = {"Mau - Mau", "Mau - Mau", "WoooW - WooW"};
        Assertions.assertArrayEquals(expectedSound, actualSound);

    }

    @Test
    public void testConvertPetsToSound1() {
        Pet[] pets = {new Dog("Dog1"), new Dog("Dog2")};
        String[] actualSound = Main.convertPetsToSound(pets);
        String[] expectedSound = {"WoooW - WooW", "WoooW - WooW"};
        Assertions.assertArrayEquals(expectedSound, actualSound);

    }

    @Test
    public void testConvertPetsToSound2() {
        Pet[] pets = {new Pet("неведома зверушка") {
            @Override
            public String makeSound() {
                return "странный звук";
            }
        }};
        String[] actualSound = Main.convertPetsToSound(pets);
        String[] expectedSound = {"странный звук"};
        Assertions.assertArrayEquals(expectedSound, actualSound);

    }

}
