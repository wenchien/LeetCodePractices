public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxOverall = nums[0];
        if (nums.length == 1) {
            return nums[0];
        } else {
            for (int i = 1; i < nums.length; ++i) {
                maxSoFar = Math.max(nums[i], maxSoFar + nums[i]);
                if (maxSoFar > maxOverall) {
                    maxOverall = maxSoFar;
                }
            }
        }
        return maxOverall;
    }
}
