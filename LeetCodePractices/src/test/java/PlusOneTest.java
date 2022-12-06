import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    PlusOne po = new PlusOne();

    @Test
    void plusOneTestCase3() {
        int[] digits = {9};
        for (int digit : po.plusOne(digits)) {
            System.out.print(digit);
        }
    }
    @Test
    void plusOneTestCase2() {
        int[] digits = {4,3,2,1};
        for (int digit : po.plusOne(digits)) {
            System.out.print(digit);
        }
    }
    @Test
    void plusOneTestCase1() {
        int[] digits = {9,9,9,9};
        for (int digit : po.plusOne(digits)) {
            System.out.print(digit);
        }
    }
}