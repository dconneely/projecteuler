package problem2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenFibonacciNumbers_0Test {
    @Test
    public void testSum10() {
        assertEquals(EvenFibonacciNumbers_0.sum(10), 10);
    }

    @Test
    public void testSum34() {
        assertEquals(EvenFibonacciNumbers_0.sum(34), 44);
    }
}
