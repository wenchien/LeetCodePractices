import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsIITest {

    private TwoSumsII twoSumsClass = new TwoSumsII();

    @Test
    public void testCase8() {
        int[] result =twoSumsClass.betterTwoSum(new int[] {1,2,3,4,4,9,56,90}, 8);
        System.out.println( Arrays.toString(result));
        assertTrue((result[0] == 4 && result[1] == 5));
    }

    @Test
    public void testCase7() {
        int[] result =twoSumsClass.betterTwoSum(new int[] {0,0,0,0,0,0,2,3,9,9,9,9,9,9}, 5);
        System.out.println( Arrays.toString(result));
        assertTrue((result[0] == 7 && result[1] == 8));
    }

    @Test
    public void testCase6() {
        int[] result =twoSumsClass.twoSum(new int[] {-3,-1,0,1,7,9}, -2);
        System.out.println( Arrays.toString(result));
        assertTrue((result[0] == 1 && result[1] == 4));
    }

    @Test
    public void testCase5() {
        int[] result =twoSumsClass.twoSum(new int[] {-1,0,1}, -1);
        System.out.println( Arrays.toString(result));
        assertTrue((result[0] == 1 && result[1] == 2));
    }

    @Test
    public void testCase4() {
        int[] result =twoSumsClass.twoSum(new int[] {-1,0}, -1);
        System.out.println( Arrays.toString(result));
        assertTrue((result[0] == 1 && result[1] == 2));
    }

    @Test
    public void testCase3() {
        int[] result =twoSumsClass.twoSum(new int[] {2,3,4}, 6);
        System.out.println( Arrays.toString(result));
        assertTrue((result[0] == 1 && result[1] == 3));
    }

    @Test
    public void testCase2() {
        int[] result =twoSumsClass.twoSum(new int[] {1,2,3,5,7,11,15}, 9);
        System.out.println( Arrays.toString(result));
        assertTrue((result[0] == 2 && result[1] == 5));
    }

    @Test
    public void testCase1() {
        StringBuilder str = new StringBuilder();
        int[] result =twoSumsClass.twoSum(new int[] {2,7,11,15}, 9);
        System.out.println( Arrays.toString(result));
        assertTrue((result[0] == 1 && result[1] == 2));
    }
}