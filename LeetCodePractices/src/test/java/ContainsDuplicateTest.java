import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void testCase3() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1,2,3,4};
        assertFalse(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void testCase1() {
        int[] nums = {1,2,3,1};
        assertTrue(containsDuplicate.containsDuplicate(nums));
    }

}