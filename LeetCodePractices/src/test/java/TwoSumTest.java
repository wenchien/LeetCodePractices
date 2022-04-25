import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void testCase4() {
        int[] nums = {3,2,3};
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 6)));
    }

    @Test
    public void testCase3() {
        int[] nums = {3,3};
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 6)));
    }

    @Test
    public void testCase2() {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 6)));
    }

    @Test
    public void testCase1() {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 9)));
    }
}