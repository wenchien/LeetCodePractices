/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some
(can be none) of the characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

import java.util.ArrayList;
import java.util.List;

public class IsSequence {

    // Brute force method
    // s = source, t = target
    public boolean isSubsequence(String s, String t) {
        boolean isOk = false;

        char[] orderedList = s.toCharArray();
        char[] targetList = t.toCharArray();

        if(orderedList.length == 0) return true;
        if(targetList.length == 0) return false;

        int orderedListPtr = 0;

        for (int i = 0; i < targetList.length; ++i) {

            // System.out.println("Target: " + targetList[i] + " orderedList: " + orderedList[orderedListPtr]);
            if (targetList[i] == orderedList[orderedListPtr]) {
                orderedListPtr++;
            }

            if(orderedListPtr == orderedList.length) {
                isOk = true;
                break;
            }
        }

        return isOk;
    }
}
