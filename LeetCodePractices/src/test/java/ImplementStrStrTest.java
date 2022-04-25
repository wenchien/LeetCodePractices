import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {

    private ImplementStrStr iss =  new ImplementStrStr();

    @Test
    public void testCase4() {
        String haystack = "aabaacdcaa", needle = "ba";
        assertEquals(2, iss.strStr(haystack, needle));
    }

    @Test
    public void testCase3() {
        String haystack = "aaaaa", needle = "";
        assertEquals(0, iss.strStr(haystack, needle));
    }

    @Test
    public void testCase2() {
        String haystack = "aaaaa", needle = "bba";
        assertEquals(-1, iss.strStr(haystack, needle));
    }

    @Test
    public void testCase1() {
        String haystack = "hello", needle = "ll";
        assertEquals(2, iss.strStr(haystack, needle));
    }
}