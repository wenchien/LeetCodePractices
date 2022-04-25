import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookupTable = new HashMap<>();

        for(int i = 0; i < nums.length; ++i) {
            lookupTable.put(nums[i], i);
        }

        System.out.println(lookupTable);
        int[] result = new int[2];

        for (int i = 0; i < nums.length; ++i) {
            int remainder = target - nums[i];
            if (lookupTable.containsKey(remainder) && lookupTable.get(remainder) != i) {
                result[0] = i;
                result[1] = lookupTable.get(remainder);
                break;
            }
        }


        return result;
    }
}
