import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber pn = new PalindromeNumber();

    @Test
    public void testCase5() {
        assertFalse(pn.isPalindromeNoConvert(10));
    }

    @Test
    public void testCase4() {
        assertTrue(pn.isPalindromeNoConvert(45654));
    }

    @Test
    public void testCase3() {
        assertFalse(pn.isPalindrome(10));
    }

    @Test
    public void testCase2() {
        assertFalse(pn.isPalindrome(-121));
    }

    @Test
    public void testCase1() {
        assertTrue(pn.isPalindrome(121));
    }

    @Test
    public void functionalityTest() {
        pn.isPalindromeNoConvert(45654);
    }

}