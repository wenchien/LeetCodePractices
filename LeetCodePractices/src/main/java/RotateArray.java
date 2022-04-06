import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);

        int[] nums2 = {-1,-100,3,99};
        rotate(nums2, 2);
    }

    // not within the same memory space
    // use queue
    public static void rotate(int[] nums, int k) {
        int lastIndex = nums.length - 1;
        int lengthOfKElements = nums.length - k;
        int[] temp = new int[nums.length];
        for (int j = lengthOfKElements - 1; j >= 0; --j) {
            temp[j + k] = nums[j];
        }

        //Arrays.stream(temp).forEach(System.out::println);

        for (int i = lengthOfKElements; i < nums.length; ++i) {
            if (nums.length %2 == 0) {
                temp[i - k] = nums[i];
            } else {
                temp[i - k - 1] = nums[i];
            }
        }
        nums = temp;
        Arrays.stream(nums).forEach(System.out::println);
    }
}
