import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    MajorityElement me = new MajorityElement();
    @Test
    public void testCase3() {
        int[] nums = {3,3,4};
        assertEquals(3, me.majorityElement(nums));
    }
    @Test
    public void testCase2() {
        int[] nums = {3,2,3};
        assertEquals(3, me.majorityElement(nums));
    }

    @Test
    public void testCase1() {
        int[] nums = {2,2,1,1,1,2,2};
        assertEquals(2, me.majorityElement(nums));
    }

}