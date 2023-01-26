import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
//    Given an array nums containing n distinct numbers in the range [0, n],
//    return the only number in the range that is missing from the array.
    public int missingNumber(int[] nums) {
        // length of nums = biggest number in the list

        // first create a look up set for nums
        Set<Integer> lookupSet = new HashSet<>();
        for (int num : nums) {
            lookupSet.add(num);
        }

        int answer = 0;
        // then search through it
        for (int i = 0; i <= nums.length; ++i) {
            if (!lookupSet.contains(i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    // Better
    public int missingNumber2(int[] nums) {
        int expected = 0;
        int actual = 0;

        // add all numbers to create expected number
        for (int i = 0; i <= nums.length; ++i) {
            expected += i;
        }

        // then create actual number
        for (int num : nums) {
            actual += num;
        }

        return expected - actual;
    }
}
