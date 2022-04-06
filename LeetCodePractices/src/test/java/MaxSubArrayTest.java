import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    private MaxSubArray maxSubArray = new MaxSubArray();

    @Test
    public void testCase4() {
        int[] nums = {-1,-2};
        System.out.println(maxSubArray.maxSubArray(nums));
        assertEquals(-1, maxSubArray.maxSubArray(nums));
    }


    @Test
    public void testCase3() {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray.maxSubArray(nums));
        assertEquals(23, maxSubArray.maxSubArray(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1};
        System.out.println(maxSubArray.maxSubArray(nums));
        assertEquals(1, maxSubArray.maxSubArray(nums));
    }

    @Test
    public void testCase1 () {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray.maxSubArray(nums));
        assertEquals(6, maxSubArray.maxSubArray(nums));
    }

}