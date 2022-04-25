import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {

    private MonotonicArray ma = new MonotonicArray();

    @Test
    public void testCase5() {
        int[] nums = {3,4,2,3};
        assertFalse(ma.isMonotonic(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {1,1,1};
        assertTrue(ma.isMonotonic(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {1,3,2};
        assertFalse(ma.isMonotonic(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {6,5,4,4};
        assertTrue(ma.isMonotonic(nums));
    }

    @Test
    public void testCase1() {
        int[] nums = {1,2,2,3};
        assertTrue(ma.isMonotonic(nums));
    }
}