import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MoveZero {
    private Queue<Integer> queue = new ArrayDeque<>();

//    public static void main(String[] args) {
//        int[] nums =  {0,1,0,3,12};
//        moveZeroes(nums);
//        System.out.println("---------------------");
//
//        int[] case2 = {0};
//        moveZeroes(case2);
//        System.out.println("---------------------");
//
//        int[] case3 = {0,0};
//        moveZeroes(case3);
//        System.out.println("---------------------");
//
//        int[] case4 = {0,0,0,0,0,0};
//        moveZeroes(case4);
//        System.out.println("---------------------");
//
//        int[] case5 = {2,1};
//        moveZeroes(case5);
//    }

    public void moveZeroes(int[] nums) {
        Arrays.stream(nums).forEach(System.out::println);
        int zeroCount = 0;
        if (nums.length == 1) {

        } else {
            // do zero moving
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == 0) {
                    ++zeroCount;
                } else {
                    queue.add(nums[i]);
                }

            }

            for (int i = 0; i < nums.length; i++) {
                if (i < nums.length - zeroCount) {
                    nums[i] = queue.poll();
                    System.out.println("Current: " + nums[i]);
                } else {
                    nums[i] = 0;
                }
            }
        }

        Arrays.stream(nums).forEach(System.out::println);
    }

    public void betterMoveZero(int[] nums) {
        int ptr1 = 0;
        int ptr2 = 0;
        for (int i = 0; i < nums.length; ++i) {
            ptr1 = i;
            ptr2 = ptr1 + 1;
            if (nums[ptr1] == 0) {
                swap(nums, ptr1);
            }
            if (nums[ptr2] == 0) {
                swap(nums, ptr2);
                ++ptr2;
            }
        }
    }

    public void swap(int[] nums, int ptr) {
        int temp = nums[ptr];
        nums[ptr] = nums[ptr + 1];
        nums[ptr + 1] = temp;
    }
}
