import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntersectionTest {

    ArrayIntersection ai = new ArrayIntersection();
    @Test
    void intersectionTestcase2() {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        printArray(ai.intersection(nums1, nums2));
    }
    @Test
    void intersectionTestcase1() {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        printArray(ai.intersection(nums1, nums2));
    }

    private void printArray(int[] answer){
        for(int i : answer) {
            System.out.println(i);
        }
    }
}