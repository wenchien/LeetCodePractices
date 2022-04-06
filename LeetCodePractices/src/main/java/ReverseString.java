public class ReverseString {

    public void reverseString(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length - 1;
        while (leftIndex <= rightIndex) {

            swap(s, leftIndex, rightIndex);
            // after swapping
            ++leftIndex;
            --rightIndex;
        }
    }

    public void swap(char[] s, int leftIndex, int rightIndex) {
        char temp = s[leftIndex];
        s[leftIndex] = s[rightIndex];
        s[rightIndex] = temp;
    }

}
