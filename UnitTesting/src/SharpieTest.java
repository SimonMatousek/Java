import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharpieTest {
    Sharpie sharpie;
    @BeforeEach
    void setup() {
        sharpie = new Sharpie("pink",10,10);
    }
    @Test
    void useSharpie() {
        assertEquals(0,sharpie.use());
    }
}
