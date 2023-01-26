import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    MissingNumber mn = new MissingNumber();

    @Test
    @DisplayName("TestCase 4 : expected 8 new")
    public void testCase4() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, mn.missingNumber2(nums));
    }


    @Test
    @DisplayName("TestCase 5 : expected 2 new")
    public void testCase5() {
        int[] nums = {3,0,1};
        assertEquals(2, mn.missingNumber2(nums));
    }

    @Test
    @DisplayName("TestCase 3 : expected 8")
    public void testCase3() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, mn.missingNumber(nums));
    }


    @Test
    @DisplayName("TestCase 1 : expected 2")
    public void testCase1() {
        int[] nums = {3,0,1};
        assertEquals(2, mn.missingNumber(nums));
    }

}