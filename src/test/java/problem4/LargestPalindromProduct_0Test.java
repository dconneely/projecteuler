package problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPalindromProduct_0Test {
    /**
     * Dumb edge case.
     */
    @Test
    public void testNoneFound() {
        assertEquals(0, LargestPalindromeProduct_0.find(4, 9));
    }

    /**
     * Dumb edge case.
     */
    @Test
    public void testOneDigitProduct() {
        assertEquals(9, LargestPalindromeProduct_0.find(1, 9));
    }

    @Test
    public void testTwoDigitProduct() {
        assertEquals(9009, LargestPalindromeProduct_0.find(11, 99));
    }

    @Test
    public void testThreeDigitProduct() {
        assertEquals(906609, LargestPalindromeProduct_0.find(101, 999));
    }

    @Test
    public void testFourDigitProduct() {
        assertEquals(99000099, LargestPalindromeProduct_0.find(1001, 9999));
    }

    @Test
    public void testFiveDigitProduct() {
        assertEquals(9966006699L, LargestPalindromeProduct_0.find(10001, 99999));
    }	

    /* Takes too long...
    @Test
    public void testSixDigitProduct() {
        assertEquals(999000000999L, LargestPalindromeProduct_0.find(100001, 999999));
    }
    */
}
