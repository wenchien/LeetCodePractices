import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodPairTest {

    private GoodPair goodPair = new GoodPair();

    @Test
    public void testCase3() {
        int[] nums = {1,2,3};
        System.out.println(goodPair.numIdenticalPairs(nums));

        assertEquals(0, goodPair.numIdenticalPairs(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1,1,1,1};
        System.out.println(goodPair.numIdenticalPairs(nums));

        assertEquals(6, goodPair.numIdenticalPairs(nums));
    }

    @Test
    public void testCase1() {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(goodPair.numIdenticalPairs(nums));

        assertEquals(4, goodPair.numIdenticalPairs(nums));
    }

}