import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = null;
        int[] theOtherNums = null;
        if (nums1.length >= nums2.length) {
            nums = nums1;
            theOtherNums = nums2;
        } else {
            nums = nums2;
            theOtherNums = nums1;
        }

        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        System.out.println(map);

        // answer
        List<Integer> answerArray = new ArrayList<>();
        for (int i : theOtherNums) {
            if (map.containsKey(i) && map.get(i) > 0) {
                map.put(i, map.get(i) - 1);
                answerArray.add(i);
            }
        }
        return answerArray.stream().mapToInt(i -> i).toArray();
    }
}
