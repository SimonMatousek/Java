import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    Animal animal;
    @BeforeEach
    void setup() {
        animal = new Animal();
    }
    @Test
    void testEat() {
        assertEquals(49, animal.eat());
        for (int i = 0; i < 49; i++) {
            animal.eat();
        }
        assertEquals(0, animal.hunger);
    }
    @Test
    void testDrink() {
        assertEquals(49, animal.drink());
        for (int i = 0; i < 49; i++) {
            animal.drink();
        }
        assertEquals(0, animal.thirst);
    }
    @Test
    void testPlay() {
        for (int i = 0; i < 36; i++){
            animal.play();
        }
        assertEquals(86, animal.hunger);
        assertEquals(86, animal.thirst);
    }
}
