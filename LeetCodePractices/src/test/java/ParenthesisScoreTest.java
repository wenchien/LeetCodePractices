import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisScoreTest {
    private ParenthesisScore ps = new ParenthesisScore();

    @Test
    public void testCase7() {
        String s = "()(())";
        int result = ps.scoreOfParentheses2(s);
        System.out.println(result);
        assertEquals(3, result);
    }

    @Test
    public void testCase6() {
        String s = "(()())";
        int result = ps.scoreOfParentheses(s);
        System.out.println(result);
        assertEquals(4, result);
    }

    @Test
    public void testCase5() {
        String s = "()()()";
        int result = ps.scoreOfParentheses(s);
        System.out.println(result);
        assertEquals(3, result);
    }

    @Test
    public void testCase4() {
        String s = "(()(()))";
        int result = ps.scoreOfParentheses(s);
        System.out.println(result);
        assertEquals(6, result);
    }

    @Test
    public void testCase3() {
        String s = "()()";
        int result = ps.scoreOfParentheses(s);
        System.out.println(result);
        assertEquals(2, result);
    }

    @Test
    public void testCase2() {
        String s = "(())";
        int result = ps.scoreOfParentheses(s);
        System.out.println(result);
        assertEquals(2, result);
    }

    @Test
    public void testCase1() {
        String s = "()";
        int result = ps.scoreOfParentheses(s);
        System.out.println(result);
        assertEquals(1, result);
    }
}