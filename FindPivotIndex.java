public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int answer = -1;
        // Create prefix sum first
        int[] prefixSum = new int[nums.length];
        int cumulativeSum = nums[0];
        prefixSum[0] = nums[0];

        for(int i = 1; i < nums.length; ++i) {
            cumulativeSum += nums[i];
            prefixSum[i] = cumulativeSum;
        }

        // Now calculate for each index, calculate the left and right
        for (int i = 0; i < nums.length; ++i) {
            // prefixSum[i] = left index
            // prefixSum[nums.length - 1] - prefixSum[i] - nums[i]
            // MaxSum - leftSum - overlapping possible pivot point
            // System.out.println("Left: " + prefixSum[i]);
            // System.out.println("right " + ((prefixSum[prefixSum.length-1] - prefixSum[i]) + nums[i]));
            if (prefixSum[i] == (prefixSum[prefixSum.length-1] - prefixSum[i]) + nums[i]) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
