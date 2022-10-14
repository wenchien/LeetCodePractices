public class RunningSumArray {

    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];

        int currentCumulative = nums[0];
        answer[0] =currentCumulative;
        for (int i = 1; i < nums.length; ++i) {
            currentCumulative += nums[i];
            answer[i] = currentCumulative;
        }

        return answer;
    }
}
