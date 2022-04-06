import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetSearchMatrixTest {

    private TargetSearchMatrix tsm = new TargetSearchMatrix();

    @Test
    public void testCase2() {
        // [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        assertFalse(tsm.searchMatrix(matrix, 13));
    }

    @Test
    public void testCase1() {
        // [1,3,5,7],[10,11,16,20],[23,30,34,60]
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        assertTrue(tsm.searchMatrix(matrix, 3));
    }
}