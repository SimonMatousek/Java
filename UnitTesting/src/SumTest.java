import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum sum;
    @BeforeEach
    public void setup() {
        sum = new Sum();
    }
    @Test
    void sum() {
        int[] toAdd1 = {1,2,3,};
        assertEquals(6,sum.sum(toAdd1));
        int[] toAdd2 ={};
        assertEquals(0,sum.sum(toAdd2));
        int[] toAdd3 = {2};
        assertEquals(2,sum.sum(toAdd3));
        int[] toAdd4 = {2,0,4};
        assertEquals(6,sum.sum(toAdd4));
    }
}