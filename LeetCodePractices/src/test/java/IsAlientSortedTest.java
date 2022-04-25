import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsAlientSortedTest {

    private IsAlientSorted ias = new IsAlientSorted();

    @Test
    public void testCase3() {
        String[] words = {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(ias.isAlienSorted(words, order));
    }

    @Test
    public void testCase2() {
        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        assertFalse(ias.isAlienSorted(words, order));
    }

    @Test
    public void testCase1() {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(ias.isAlienSorted(words, order));
    }
}