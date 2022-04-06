public class ReverseWords {

    public String reverseWords(String s) {

        // could've done it via Splitter.on.......
        // but using default java
        String[] splitted = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < splitted.length; ++i) {
            String word = splitted[i];
            int leftIndex = 0;
            int rightIndex = word.length() - 1;
            char[] c = word.toCharArray();
            while (leftIndex <= rightIndex) {
                swap(c, leftIndex, rightIndex);
                // after swapping
                ++leftIndex;
                --rightIndex;
            }
            if (i == splitted.length - 1) {
                result.append(c);
            } else {
                result.append(c);
                result.append(" ");
            }

        }


        return result.toString();
    }

    public void swap(char[] s, int leftIndex, int rightIndex) {
        char temp = s[leftIndex];
        s[leftIndex] = s[rightIndex];
        s[rightIndex] = temp;
    }
}
