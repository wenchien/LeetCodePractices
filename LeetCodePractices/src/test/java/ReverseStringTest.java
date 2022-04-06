import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    private ReverseString reverseString = new ReverseString();

    @Test
    public void testCase4() {
        char[] charString = {'a'};
        reverseString.reverseString(charString);
        System.out.println(Arrays.toString(charString));
    }

    @Test
    public void testCase3() {
        char[] charString = {'a','h'};
        reverseString.reverseString(charString);
        System.out.println(Arrays.toString(charString));
    }

    @Test
    public void testCase2() {
        char[] charString = {'H','a','n','n','a','h'};
        reverseString.reverseString(charString);
        System.out.println(Arrays.toString(charString));
    }

    @Test
    public void testCase1() {
        char[] charString = {'h','e','l','l','o'};
        reverseString.reverseString(charString);
        System.out.println(Arrays.toString(charString));
    }

}