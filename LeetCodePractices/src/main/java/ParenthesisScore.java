import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class ParenthesisScore {
    private Stack<Character> charStack = new Stack<Character>();
    private Stack<Integer> operationStack = new Stack<Integer>();

    public int scoreOfParentheses(String s) {
        int result = 0;
        boolean isDoubling = false;
        char[] charArray =  s.toCharArray();
        int index = 0;
        for(char c : charArray) {
            if (')' == c) {
                if (index == charArray.length - 1) {
                    if (!isDoubling) {
                        ++result;
                    }
                    break;
                }
                if ('(' == charStack.peek()) {
                    System.out.println("A balanced parenthesis, adding result");
                    charStack.pop();
                    System.out.println(++result);
                }
            }

            if ('(' == c) {
                if (!charStack.empty()) {
                    isDoubling = true;
                }
                charStack.add(c);
            }
            ++index;
        }

        if (isDoubling) {
            result = result * 2;
        }

        return result;
    }

    public int scoreOfParentheses2(String s) {
        int result = 0;
        boolean isDoubling = false;
        char[] charArray =  s.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            // if we're at the last index, we don't need to check anymore since it's always balanced parenthesis
            if (i == charArray.length - 1) {
                break;
            }
            // check immediate right
            // if it is ), that means it's a balanced (), so we add 1 to the stack
            // if it is (, that means it's meant to be *2, so we add 2 to the stack
            if (')' == charArray[i + 1]) {
                operationStack.add(1);
            }
            if ('(' == charArray[i + 1]) {
                operationStack.add(2);
            }
        }

        // 1 means add one to the result
        // 2 means *2 of the current result;
        // Starting from the top of the stack
        for (int number : operationStack) {
            if (operationStack.peek() != null) {
                if (operationStack.peek() == 1) {
                    ++result;
                    operationStack.pop();
                } else if (operationStack.peek() == 2) {
                    result *= 2;
                    operationStack.pop();
                }
            }

        }

        return result;
    }

}
