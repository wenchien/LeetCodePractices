public class TwoSumsII {

    // Two linear searches
    // O(N^2)
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean answerFound = false;
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                int twoNumbersSum = numbers[i] + numbers[j];
                if (target > 0) {
                    System.out.println(twoNumbersSum);
                    if (numbers[i] > target || numbers[j] > target || twoNumbersSum > target) {
                        System.out.println("Condition not met");
                    }
                }
                if (target < 0) {
                    System.out.println(twoNumbersSum);
                    if (numbers[i] < target || numbers[j] < target || twoNumbersSum < target) {
                        System.out.println("Condition not met");
                    }
                }
                if (twoNumbersSum == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    answerFound = true;
                    break;
                }
            }
            if (answerFound) {
                break;
            }
        }

        return result;
    }

    // Utilizes binary search
    // O(NLogN)
    public int[] betterTwoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean answerFound = false;
        for (int i = 0; i < numbers.length; ++i) {
            int requiredNumber = target - numbers[i];
            // then search for that number in the array list
            // since it's sorted we can perform binary search
            int leftIndex = 0;
            int rightIndex = numbers.length - 1;
            while (leftIndex <= rightIndex) {
                int pivot = leftIndex + ((rightIndex - leftIndex) / 2);
                if (numbers[pivot] == requiredNumber) {
                    if (pivot + 1 < numbers.length && numbers[pivot + 1] == requiredNumber) {
                        // if then next one is also ok, use the next one instead
                        result[0] = i + 1;
                        result[1] = pivot + 2;
                    } else {
                        result[0] = i + 1;
                        result[1] = pivot + 1;
                    }
                    answerFound = true;
                    break;
                } else {
                    if (numbers[pivot] > requiredNumber) {
                        rightIndex = pivot - 1;
                    } else if (numbers[pivot] < requiredNumber) {
                        leftIndex = pivot + 1;
                    }
                }
            }
            if (answerFound) {
                break;
            }
        }

        return result;
    }
}
