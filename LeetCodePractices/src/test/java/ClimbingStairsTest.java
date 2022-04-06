import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private ClimbingStairs cs = new ClimbingStairs();

    // Without Memoization
    @Test
    public void testCase4() {
        int n = 44;
        assertEquals(1134903170, cs.oldClimbStairs(n));
        System.out.println("Ways: " + cs.oldClimbStairs(n));
    }

    // With Memoization
    @Test
    public void testCase3() {
        int n = 44;
        assertEquals(1134903170, cs.climbStairs(n));
        System.out.println("Ways: " + cs.climbStairs(n));
    }

    @Test
    public void testCase2() {
        int n = 3;
        assertEquals(3, cs.climbStairs(n));
        System.out.println("Ways: " + cs.climbStairs(n));
    }

    @Test
    public void testCase1() {
        int n = 2;
        assertEquals(2, cs.climbStairs(n));
        System.out.println("Ways: " + cs.climbStairs(n));
    }

}