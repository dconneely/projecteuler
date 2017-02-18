package problem4;

public class LargestPalindromeProduct_0 {

    public static void main(String[] args) {
        System.out.println(find(10, 99));
    }

    static long find(int a, int b) {
        long maxP = 0;
        for (int i = b; i >= a; --i) {
            for (int j = i; j >= a; --j) {
                long P = (long) i * (long) j;
                if (P >= maxP && isPalindrome(P)) {
                    maxP = P;
                }
            }
        }
        return maxP;
    }

    static boolean isPalindrome(long value) {
        if (value < 0L) {
            // negative numbers are never palindromic.
            return false;
        } else if (value < 10) {
            // single digit numbers are always palindromic.
            return true;
        } else if (value < 100) {
            return value % 10 == value / 10;
        } else if (value < 1000) {
            return value % 10 == value / 100;
        } else if (value < 10000) {
            return value % 10 == value / 1000 && value / 10 % 10 == value / 100 % 10;
        } else if (value < 100000) {
            return value % 10 == value / 10000 && value / 10 % 10 == value / 1000 % 10;
        } else if (value < 1000000) {
            return value % 10 == value / 100000 && value / 10 % 10 == value / 10000 % 10 && value / 100 % 10 == value / 1000 % 10;
        } else if (value < 10000000) {
            return value % 10 == value / 1000000 && value / 10 % 10 == value / 100000 % 10 && value / 100 % 10 == value / 10000 % 10;
        } else if (value < 100000000) {
            return value % 10 == value / 10000000 && value / 10 % 10 == value / 1000000 % 10 && value / 100 % 10 == value / 100000 % 10 && value / 1000 % 10 == value / 10000 % 10;
        } else if (value < 1000000000) {
            return value % 10 == value / 100000000 && value / 10 % 10 == value / 10000000 % 10 && value / 100 % 10 == value / 1000000 % 10 && value / 1000 % 10 == value / 100000 % 10;
        } else if (value < 10000000000L) {
            return value % 10 == value / 1000000000 && value / 10 % 10 == value / 100000000 % 10 && value / 100 % 10 == value / 10000000 % 10 && value / 1000 % 10 == value / 1000000 % 10 && value / 10000 % 10 == value / 100000 % 10;
        } else if (value < 100000000000L) {
            return value % 10 == value / 10000000000L && value / 10 % 10 == value / 1000000000 % 10 && value / 100 % 10 == value / 100000000 % 10 && value / 1000 % 10 == value / 10000000 % 10 && value / 10000 % 10 == value / 1000000 % 10;
        } else if (value < 1000000000000L) {
            return value % 10 == value / 100000000000L && value / 10 % 10 == value / 10000000000L % 10 && value / 100 % 10 == value / 1000000000 % 10 && value / 1000 % 10 == value / 100000000 % 10 && value / 10000 % 10 == value / 10000000 % 10 && value / 100000 == value / 1000000;
        } else if (value < 10000000000000L) {
            return value % 10 == value / 1000000000000L && value / 10 % 10 == value / 100000000000L % 10 && value / 100 % 10 == value / 10000000000L % 10 && value / 1000 % 10 == value / 1000000000 % 10 && value / 10000 % 10 == value / 100000000 % 10 && value / 100000 == value / 10000000;
        } else {
            throw new UnsupportedOperationException("14 digits or more not supported");
        }
    }
}
