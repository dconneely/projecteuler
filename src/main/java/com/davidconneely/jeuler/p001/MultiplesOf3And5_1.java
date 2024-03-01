package com.davidconneely.jeuler.p001;

/**
 * <h3>Multiples of 3 and 5</h3> <h4>Problem 1</h4> If we list all the natural numbers below 10 that are multiples of 3 or 5, we get
 * 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class MultiplesOf3And5_1 {
    public static void main(String[] args) {
        System.out.println(sum(1_000));
    }

    // upperBound is exclusive.
    static long sum(int upperBound) {
        long sum = 0L;
        for (int i = 1; i < upperBound; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
