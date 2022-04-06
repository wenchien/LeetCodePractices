import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    private ReverseWords reverseWords = new ReverseWords();

    @Test
    public void testCase23() {
        String s = "DingGe3";
        System.out.println(reverseWords.reverseWords(s));
    }

    @Test
    public void testCase2() {
        String s = "God Ding";
        System.out.println(reverseWords.reverseWords(s));
    }

    @Test
    public void testCase1() {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords.reverseWords(s));
    }

}