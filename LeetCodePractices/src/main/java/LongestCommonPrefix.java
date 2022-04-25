import com.extraClasses.Trie;

public class LongestCommonPrefix {

    // Trie solution
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        Trie trie = new Trie();
        for (String word : strs) {
            trie.insert(word);
        }

        return trie.commonPrefix();
    }

    // O(m+n)
    // Essentially we're comparing each word to the current Longest Common Prefix and update it
    public String betterLongestCommonPrefix(String[] strs) {
        // Set initial prefix to the first word;
        String prefix = strs[0];
        for (int i = 0; i < strs.length; ++i) {
            prefix = findLCP(prefix, strs[i]);
        }
        return prefix;
    }

    public String findLCP(String str1, String str2) {
        int i = 0 , j = 0;
        while (i < str1.length() && j < str2.length()) {
            // Use i as right end of the prefix
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            ++i;
            ++j;
        }

        return str1.substring(0, i);
    }
}
