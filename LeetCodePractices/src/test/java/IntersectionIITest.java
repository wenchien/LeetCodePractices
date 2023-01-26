import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionIITest {

    IntersectionII aiii = new IntersectionII();

    @Test
    void intersect() {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        printArray(aiii.intersect(nums1, nums2));
    }

    private void printArray(int[] answer){
        for(int i : answer) {
            System.out.println(i);
        }
    }
}