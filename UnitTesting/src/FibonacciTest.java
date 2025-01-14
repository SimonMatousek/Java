import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    Fibonacci fibonacci;
    @BeforeEach
    void setup() {
        fibonacci = new Fibonacci();
    }
    @Test
    void isFibonacci() {
        assertEquals(3,fibonacci.showFibonacciSequence(5));
        assertEquals(1,fibonacci.showFibonacciSequence(2));
        assertEquals(34,fibonacci.showFibonacciSequence(10));
        assertEquals(0,fibonacci.showFibonacciSequence(1));
    }
}
