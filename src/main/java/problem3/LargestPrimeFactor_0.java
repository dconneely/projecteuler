package problem3;

/**
 * -
 * <h3>Largest prime factor</h3>
 * <h4>Problem 3</h4>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor_0 {
    public static void main(String[] args) {
        System.out.println(lpf(600851475143L));
    }

    static long lpf(long n) {
        // special case value that we can't negate, but we know the answer.
        if (n == Long.MIN_VALUE) {
            return 2;
        }
        // make other values positive.
        if (n < 0) {
            n = -n;
        }
        // can't factorize 0 or 1 (or -1).
        if (n < 2) {
            return 0;
        }
        // repeatedly divide by low primes until left with highest prime.
        long d = 2;
        while (true) {
            while (n % d == 0) {
                n /= d;
            }
            if (n == 1) {
                return d;
            }
            // try next divisor.
            if (d == 2) {
                d = 3;
            } else {
                d += 2;
            }
            // if d > sqrt(n), then n is prime.
            if (d * d > n) {
                return n;
            }
        }
    }
}
