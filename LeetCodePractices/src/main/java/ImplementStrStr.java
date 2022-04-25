import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        if (l2 > l1)
            return -1;
        if (l1 == l2) {
            if (needle.equals(haystack))
                return 0;
            else
                return -1;
        }
        for (int i = 0; i <= l1 - l2; i++) {

            if (l2 == 1) {
                if (needle.charAt(0) == haystack.charAt(i))
                    return i;
            } else if (needle.equals(haystack.substring(i, i + l2)))
                return i;
        }
        return -1;
    }
}
