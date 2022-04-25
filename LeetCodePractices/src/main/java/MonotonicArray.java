public class MonotonicArray {
    // Requires optimization
    public boolean isMonotonic(int[] nums) {
        int prevNumber = 0;
        boolean isMonotonic = true;
        if (nums.length <= 2) {
            return true;
        } else {

            boolean isMonotonicIncrease = false;
            boolean isMonotonicDecrease = false;
            // use first and last element to determine the result
            if (nums[0] > nums[nums.length - 1]) {
                isMonotonicDecrease = true;
            } else if (nums[0] < nums[nums.length - 1]) {
                isMonotonicIncrease = true;
            }

            if (!isMonotonicIncrease && !isMonotonicDecrease) {
                if (nums[0] > nums[1]) {
                    isMonotonicDecrease = true;
                } else if (nums[0] < nums[1]) {
                    isMonotonicIncrease = true;
                }
            }

            System.out.println("Increase: " + isMonotonicIncrease);
            System.out.println("Decrease: " + isMonotonicDecrease);

            for (int i = 0; i < nums.length; ++i) {
                if (i != nums.length - 1) {
                    if (nums[i] == nums[i + 1]) {
                        continue;
                    } else if (nums[i] > nums[i + 1] && isMonotonicIncrease) {
                        isMonotonic = false;
                        break;
                    } else if (nums[i] < nums[i + 1] && isMonotonicDecrease) {
                        isMonotonic = false;
                        break;
                    }
                }
            }
        }
        return isMonotonic;
    }
}
