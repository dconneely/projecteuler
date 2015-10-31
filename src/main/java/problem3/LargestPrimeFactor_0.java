package problem3;

/**-
 * <h3>Largest prime factor</h3>
 * <h4>Problem 3</h4>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor_0 {
    public static void main(String[] args) {
        System.out.println(sum(4_000_000));
    }

    // upperBound is inclusive.
    static long sum(int upperBound) {
        int m2 = 0;
        int m1 = 1;
        long sum = 0L;
        while (true) {
            int val = m2 + m1;
            if (val > upperBound) {
                return sum;
            }
            if (val % 2 == 0) {
                sum += val;
            }
            m2 = m1;
            m1 = val;
        }
    }
}
