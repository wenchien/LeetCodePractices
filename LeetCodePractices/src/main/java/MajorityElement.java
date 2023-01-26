import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> lookupTable = new HashMap<>();
        for (int num : nums) {
            lookupTable.computeIfPresent(num, (number, count) -> count + 1);
            lookupTable.computeIfAbsent(num, (number) -> 1);
        }

        int currentAnswer = 0;
        int currentMaxFreq = 0;
        System.out.println(lookupTable);
        for (Map.Entry<Integer, Integer> entry : lookupTable.entrySet()) {
            if (currentMaxFreq < entry.getValue()) {
                currentAnswer = entry.getKey();
                currentMaxFreq = entry.getValue();
            }
        }

        return currentAnswer;
    }
}
