import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {
    Anagram anagram;
    @BeforeEach
    public void setup() {
        anagram = new Anagram();
    }
    @Test
    void testAnagram() {
        assertTrue(anagram.isAnagram("arc", "car"));
        assertFalse(anagram.isAnagram("car","sum"));

    }
}
