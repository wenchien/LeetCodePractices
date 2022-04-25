import java.util.Arrays;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        boolean result = true;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        return result;
    }

    // Could you solve it without converting the integer to a string?
    public boolean isPalindromeNoConvert(int x) {

        // if negative return false
        if (x < 0) {
            return false;
        }

        int result = x;
        int length = 0;
        // Calculate needed extra space
        while (result != 0) {
            result = result / 10;
            ++length;
        }
        System.out.println("Space needed: " + length);

        // Create spaces needed
        int[] resultArray = new int[length];
        int remainder = Integer.MAX_VALUE;
        result = x;
        int index = 0;

        while (result != 0) {
            remainder = result % 10;
            resultArray[index] = remainder;
            ++index;
            result = result / 10;
        }

        System.out.println(Arrays.toString(resultArray));

        boolean isPalindrome = true;

        for (int i = 0; i < resultArray.length; ++i) {
            if (resultArray[i] != resultArray[resultArray.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
        // 121 -> 1111001
        // 120 -> 1111000
        // 323 -> 101000011
        // 222 -> 11011110
        // 121 / 10 -> 12.1 -> 12 121/10 = 12 ....1
        // 1001 /10 = 100 ...1
        // 1331 / 10 = 133....1  133 / 10
        // 45654 / 10 = 4565...4   4565 / 10 = 456...5 456/10 = 45....6  45/10 = 4...5 4/ 10 = 0...4

    }
}
