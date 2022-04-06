import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroTest {

    private MoveZero moveZeroMainClass = new MoveZero();

    @Test
    public void testCase5 () {
        int[] nums =  {2,1};
        moveZeroMainClass.moveZeroes(nums);
    }


    @Test
    public void testCase4 () {
        int[] nums =  {0,0,0,0,0,0};
        moveZeroMainClass.moveZeroes(nums);
    }

    @Test
    public void testCase3 () {
        int[] nums =  {0,0};
        moveZeroMainClass.moveZeroes(nums);
    }

    @Test
    public void testCase2 () {
        int[] nums =  {0};
        moveZeroMainClass.moveZeroes(nums);
    }


    @Test
    public void testCase1 () {
        int[] nums =  {0,1,0,3,12};
        moveZeroMainClass.moveZeroes(nums);
    }
}