import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleTest {
    Apples apples;

    @BeforeEach
    public void setup() {
        apples = new Apples();
    }

    @Test
   public void getAppleShouldReturnApple() {
        assertEquals("Apple", apples.getApple());
    }
}
