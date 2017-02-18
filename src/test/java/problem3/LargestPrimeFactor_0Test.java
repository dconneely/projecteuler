package problem3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactor_0Test {
	/** Dumb edge case. */
    @Test
    public void testLpfMinusOne() {
        assertEquals(0, LargestPrimeFactor_0.lpf(-1));
    }

	/** Dumb edge case. */
    @Test
    public void testLpfZero() {
        assertEquals(0, LargestPrimeFactor_0.lpf(0));
    }

	/** Dumb edge case. */
    @Test
    public void testLpfOne() {
        assertEquals(0, LargestPrimeFactor_0.lpf(1));
    }

    @Test
    public void testLpf2() {
        assertEquals(2, LargestPrimeFactor_0.lpf(2));
    }

    @Test
    public void testLpf6() {
        assertEquals(3, LargestPrimeFactor_0.lpf(6));
    }

    @Test
    public void testLpfMinus6() {
        assertEquals(3, LargestPrimeFactor_0.lpf(-6));
    }

    @Test
    public void testLpf13195() {
        assertEquals(29, LargestPrimeFactor_0.lpf(13195));
    }

    @Test
    public void testLpf600851475143() {
        assertEquals(6857, LargestPrimeFactor_0.lpf(600851475143L));
    }

    /** A large prime. */
    @Test
    public void testLpfBigPrime() {
        assertEquals(32416190071L, LargestPrimeFactor_0.lpf(32416190071L));
    }

    /** Product of two adjacent primes. */
    @Test
    public void testLpfAdjacent() {
        assertEquals(179426549, LargestPrimeFactor_0.lpf(32193876079309559L));
    }

    /** Prime multiplied by itself. */
    @Test
    public void testLpfSquare() {
        assertEquals(179426549, LargestPrimeFactor_0.lpf(32193886486049401L));
    }
}
