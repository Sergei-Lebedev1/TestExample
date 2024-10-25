import org.example.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSoundCat {
    @Test
    public void testMakeSound() {
        Cat cat1 = new Cat("Barsik");
        Assertions.assertEquals("Mau - Mau", cat1.makeSound());
    }

}
