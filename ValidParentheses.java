import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        boolean isValid = true;
        for (char c : chars) {
            if (c == '(' || c == '{' || c =='[') {
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty() &&c == ')' && stack.peek() == '(') stack.pop();
            else if (!stack.isEmpty() && c == '}' && stack.peek() == '{') stack.pop();
            else if (!stack.isEmpty() && c == ']' && stack.peek() == '[') stack.pop();
            else {
                isValid = false;
                break;
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return isValid;
    }
}
