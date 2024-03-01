package com.davidconneely.jeuler.p002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
