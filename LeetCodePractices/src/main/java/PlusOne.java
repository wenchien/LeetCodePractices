import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int lastDigitIndex = digits.length - 1;
        int lastDigitIncremented = digits[lastDigitIndex] + 1;
        List<Integer> answer = new ArrayList<>();

        if (lastDigitIncremented >= 10) {
            answer.add(0, 0);
            int plusOneToNextDigit = 1;
            for (int i = lastDigitIndex - 1; i >= 0; --i) {
                int nextDigit = digits[i];
                answer.add(0, nextDigit);
                if (plusOneToNextDigit == 1) {
                    if (nextDigit + 1 >= 10) {
                        answer.set(0, 0);
                        plusOneToNextDigit = 1;
                    } else {
                        int newDigit = answer.get(0) + 1;
                        answer.set(0, newDigit);
                        plusOneToNextDigit = 0;
                    }
                }
            }
            if (plusOneToNextDigit == 1) {
                answer.add(0, 1);
            }
            //System.out.println(answer);
            int[] finalAnswer = new int[answer.size()];
            finalAnswer = answer.stream().mapToInt(i -> i).toArray();;
            return finalAnswer;
            //for(int i = lastDigitIndex - 1;)
        } else {
            digits[lastDigitIndex] = lastDigitIncremented;
            return digits;
        }

    }

}

