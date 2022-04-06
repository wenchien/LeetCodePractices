import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TargetSearchMatrix {
    // Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
    // 1. Integers in each row are sorted from left to right.
    // 2. The first integer of each row is greater than the last integer of the previous row.
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        int[] rowToBeSearched = null;
        for (int[] row : matrix) {
            System.out.println("Current row: " + Arrays.toString(row));
            if (target >= row[0]) {
                System.out.println("In here");
                rowToBeSearched = row;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(rowToBeSearched));
        if (rowToBeSearched != null) {
            // do binarySearch
            System.out.println("Doing binary search");
            int leftIndex = 0;
            int rightIndex = rowToBeSearched.length - 1;
            while (leftIndex <= rightIndex) {
                int pivot = leftIndex + ((rightIndex - leftIndex) / 2);
                if (rowToBeSearched[pivot] == target) {
                    result = true;
                    break;
                }
                if (rowToBeSearched[pivot] < target) {
                    // go left
                    leftIndex = pivot + 1;
                } else {
                    rightIndex = pivot - 1;
                }
            }
        }

        return result;
    }
}
