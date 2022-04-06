import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplacePatternTest {

    private ReplacePattern rp = new ReplacePattern();

    @Test
    public void testCase2() {
        String[] words = {"a","b","c"};
        String pattern = "a";
        rp.findAndReplacePattern(words, pattern).forEach(System.out::println);
    }

    @Test
    public void testCase1() {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        rp.findAndReplacePattern(words, pattern).forEach(System.out::println);
    }


}