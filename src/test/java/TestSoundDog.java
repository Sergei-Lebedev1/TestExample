import org.example.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSoundDog {
    @Test
    public void testMakeSound() {
        Dog dog1 = new Dog("Bobik");
        Assertions.assertEquals("WoooW - WooW", dog1.makeSound());
    }

}
