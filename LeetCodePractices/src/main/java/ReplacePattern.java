import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> answer = new ArrayList<>();
        char[] patternArray = pattern.toCharArray();
        for (String str : words) {
            HashMap<Character, Character> mapper = new HashMap<>();
            HashMap<Character, Character> reverseMap = new HashMap<>();
            char[] charArray = str.toCharArray();
            boolean isOk = true;
            for (int i = 0; i < str.length(); ++i) {
                char c = 0;
                char c_rev = 0;
                if (mapper.containsKey(patternArray[i])) {
                    c = mapper.get(patternArray[i]);
                }
                if (reverseMap.containsKey(charArray[i])) {
                    c_rev = reverseMap.get(charArray[i]);
                }
                if (c != 0 && c != charArray[i]) {
                    isOk = false;
                    break;

                } else if (c_rev != 0 && c_rev != patternArray[i]) {
                    isOk = false;
                    break;
                } else {
                    mapper.put(patternArray[i], charArray[i]);
                    reverseMap.put(charArray[i], patternArray[i]);
                }
            }

            if (isOk) {
                answer.add(str);
            }
        }
        return answer;
    }
}
