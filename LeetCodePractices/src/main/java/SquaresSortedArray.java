import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] testcase = {-4,-1,0,3,10};
        // Arrays.stream(sortedSquares(testcase)).forEach(System.out::println);
        Arrays.stream(sortedSquaresLinear(testcase)).forEach(System.out::println);
    }

    public static int[] sortedSquares(int[] nums) {
        // Square them up
        int[] squaredNumbers = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            squaredNumbers[i] = nums[i] * nums[i];
        }
        Arrays.sort(squaredNumbers);

        return squaredNumbers;
    }

    public static int[] sortedSquaresLinear(int[] nums) {
        int[] squaredNumbers = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int indexPtr = rightIndex;
        while (leftIndex <= rightIndex) {
            System.out.println("Before: " + indexPtr);
            if (Math.pow(nums[rightIndex], 2) > Math.pow(nums[leftIndex], 2)) {
                System.out.println("rightIndex ^ 2");
                squaredNumbers[indexPtr] = nums[rightIndex] * nums[rightIndex];
                --rightIndex;

            } else {
                System.out.println("leftIndex ^ 2");
                squaredNumbers[indexPtr] = nums[leftIndex] * nums[leftIndex];
                ++leftIndex;
            }
            --indexPtr;
            System.out.println("Current: " + squaredNumbers[indexPtr]);
            if (leftIndex == rightIndex) {
                squaredNumbers[0] = nums[rightIndex];
                break;
            }
        }

        return squaredNumbers;
    }
}
