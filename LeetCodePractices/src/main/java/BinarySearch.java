public class BinarySearch {
    public static void main(String[] args) {
        int[] nums  = {-1,0,3,5,9,12};
        int[] notFoundNums = {2, 7};
        int[] specialCase = {1,3};
        int[] specialCase2 = {1};

//        for (int number : nums) {
//            System.out.println("Validing found case: " + search(nums,number));
//        }
//
//        for (int number : nums) {
//            System.out.println("Validating better binary search: " + betterBinarySearch(nums,number));
//        }

        for (int number : nums) {
            System.out.println("Validating results that can be found: Index of " + searchInsert(nums, number));
        }

        for (int number : notFoundNums) {
            System.out.println("Validating results that can NOT be found: Index of " + searchInsert(nums, number));
        }

        System.out.println("Validating special case result: Index of " + searchInsert(specialCase, 2));
        System.out.println("Validating special case 2 result: Index of " + searchInsert(specialCase2, 1));

        System.out.println("First Bad Version: " + firstBadVersion(1));




    }
    // Given an array of integers nums which is
    // sorted in ascending order, and an integer target,
    // write a function to search target in nums.
    // If target exists, then return its index. Otherwise, return -1.
    public static int search(int[] nums, int target) {
        int index = -1;
        return searchRecursive(nums, 0, nums.length, target, index);
    }

    public static int searchRecursive(int[] nums, int start, int end, int target, int index) {
        int length = end + start;
        int middle = ((end + start) / 2);
        System.out.println("Start Index: " + start );
        System.out.println("End Index: " + end );
        System.out.println("Middle Index: " + middle);

        //find middle point, there are two cases
        // Odd cases
        if (middle % 2 != 0) {
            if (nums[middle] == target || start == end) {
                System.out.println("Found");
                index = middle;
            } else {
                if (nums[middle] > target) {
                    // go left
                    System.out.println("Odd Go Left");
                    index = searchRecursive(nums, start, middle - 1, target, index);
                } else {
                    // go right
                    System.out.println("Odd Go Right");
                    index = searchRecursive(nums, middle + 1, end, target, index);
                }

            }

        } else {
            // Even cases
            int leftIndex = (length / 2) - 1;
            int rightIndex = (length / 2) + 1;
            if (middle == 0) {
                // 0 is even
                index = 0;
            }
            if (start == end && start < nums.length) {
                index = start; // or index = end, it doesn't matter
            }
            if (leftIndex >= 0 && nums[leftIndex] == target) {
                index = leftIndex;

            } else if (rightIndex < nums.length && nums[rightIndex] == target) {
                index = rightIndex;

            } else {
                if (leftIndex >= 0 && nums[leftIndex] > target) {
                    System.out.println("EVen Go Left");
                    index = searchRecursive(nums, start, leftIndex, target, index);
                } else if (rightIndex < nums.length && nums[rightIndex] < target){
                    System.out.println("Even Go right");
                    index = searchRecursive(nums, rightIndex, end, target, index);
                }
            }
        }
        System.out.println("Final Index before return:  " + index);
        return index;
    }

    // Lesson learned
    // move left and right pointer using pivot point'
    // pivot point is always middle offsetting by leftIndex
    public static int betterBinarySearch(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int index = -1;
        while (leftIndex <= rightIndex) {
            // Find middle / pivot point
            int pivot = leftIndex + ((rightIndex - leftIndex) / 2);
            if (nums[pivot] == target) {
                index = pivot;
                break;
            } else {
                if (nums[pivot] > target) {
                    rightIndex = pivot - 1;

                } else {
                    leftIndex = pivot + 1;
                }
            }
        }
        return index;
    }

    public static int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int index = -1;
        int pivot = 0;
        while (leftIndex <= rightIndex) {
            pivot = leftIndex + ((rightIndex - leftIndex) / 2);
            if (nums[pivot] == target) {
                index = pivot;
                break;
            } else {
                if (nums[pivot] > target) {
                    // go left
                    rightIndex = pivot - 1;
                } else {
                    leftIndex = pivot + 1;
                }
            }
        }

        if (index == -1) {
            // Get the last pivot point
            if (nums[pivot] > target) {
                System.out.println("Pivot: " + pivot);
                index = pivot;
                if (index < 0) {
                    index = 0; // set boundaries
                }
            } else {
                index = pivot + 1;
            }
        }

        return index;
    }

    public static int firstBadVersion(int n) {
        int leftIndex = 0;
        int rightIndex = n;
        int index = -1;
        while(leftIndex <= rightIndex) {
            int pivot = leftIndex + ((rightIndex - leftIndex) / 2);
            if (n == 1) {
                index = 1;
                break;
            }
            if (!isBadVersion(pivot) && isBadVersion(pivot + 1)) {
                index = pivot + 1;
                break;
            } else {
                if (!isBadVersion(pivot) && !isBadVersion(pivot + 1)) {
                     // go right
                    leftIndex = pivot + 1;
                } else {
                    rightIndex = pivot - 1;
                }
            }
        }

        return index;
    }

    public static boolean isBadVersion(int version) {
        boolean[] versions = {true};
        return versions[version];
    }


}
