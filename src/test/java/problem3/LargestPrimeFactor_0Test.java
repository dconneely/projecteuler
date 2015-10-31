package problem3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactor_0Test {
    @Test
    public void testSum10() {
        assertEquals(LargestPrimeFactor_0.sum(10), 10);
    }

    @Test
    public void testSum34() {
        assertEquals(LargestPrimeFactor_0.sum(34), 44);
    }
}
