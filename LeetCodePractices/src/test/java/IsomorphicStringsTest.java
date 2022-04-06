import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    private IsomorphicStrings is = new IsomorphicStrings();

    @Test
    public void testCase4() {
        String s = "badc", t = "baba";
        assertFalse(is.isIsomorphic(s, t));
    }

    @Test
    public void testCase3() {
        String s = "paper", t = "title";
        assertTrue(is.isIsomorphic(s, t));
    }

    @Test
    public void testCase2() {
        String s = "foo", t = "bar";
        assertFalse(is.isIsomorphic(s, t));
    }

    @Test
    public void testCase1() {
        String s = "egg", t = "add";
        assertTrue(is.isIsomorphic(s, t));
    }


}