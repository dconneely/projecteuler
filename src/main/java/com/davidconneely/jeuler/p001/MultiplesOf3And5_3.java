package com.davidconneely.jeuler.p001;

/**
 * <h3>Multiples of 3 and 5</h3> <h4>Problem 1</h4> If we list all the natural numbers below 10 that are multiples of 3 or 5, we get
 * 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class MultiplesOf3And5_3 {
    public static void main(String[] args) {
        System.out.println(sum(1_000));
    }

    // upperBound is exclusive.
    static long sum(int upperBound) {
        return sumDivisibleBy(upperBound, 3) + sumDivisibleBy(upperBound, 5) - sumDivisibleBy(upperBound, 3 * 5);
    }

    // We can calculate this in O(1), rather than O(N).
    static long sumDivisibleBy(int upperBound, int divisor) {
        int numFactors = (upperBound - 1) / divisor;
        return numFactors * (numFactors - 1) / 2 * divisor;
    }
}
