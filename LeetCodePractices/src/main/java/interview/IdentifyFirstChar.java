package interview;

public class IdentifyFirstChar {
    public String solution(String s) {
        char c = s.charAt(0);
        if (65 <= c && c <= 90) {  // 65-90
            return "upper";
        } else if (97 <= c && c <= 122) {  // 97 - 122
            return "lower";
        } else if (48 <= c && c <= 57) {  // 48-57
            return "digit";
        } else {
            return "other";
        }

    }
}
