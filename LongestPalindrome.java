import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        char[] table = new char[128];
        int answer = 0;

        for(char c : chars) {
            table[c]++;
        }

        for (int value : table) {
            System.out.println("Before" + answer);
            answer += ((value / 2 )* 2);
            System.out.println("After" + answer);
            if (answer % 2== 0 && value % 2 == 1) {
                answer++;
                System.out.println("is Odd" + answer);
            }
        }

        return answer;
    }
}
