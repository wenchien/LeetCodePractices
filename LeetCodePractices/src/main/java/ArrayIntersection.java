import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        // check which array should be used to build mapping table
        // 0 <= nums1[i], nums2[i] <= 1000
        boolean[] map = new boolean[1001];

        // create a unique mapping table
        Set<Integer> intersectionSet = new HashSet<>();
        for (int i : nums1) {
            map[i] = true;
        }

        int[] intersection = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int n : nums2) {
            if (map[n]) {
                intersection[index] = n;
                index++;
                map[n] = false;
            }
        }

        return Arrays.copyOf(intersection, index);
    }
}
