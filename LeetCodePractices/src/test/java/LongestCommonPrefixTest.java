import com.extraClasses.Trie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private LongestCommonPrefix lcp = new LongestCommonPrefix();

    @Test
    public void testCase4() {
        String[] words = {"flower","flow","flight"};
        System.out.println("Common Prefix: " + lcp.betterLongestCommonPrefix(words));
    }

    @Test
    public void testCase3() {
        String[] words = {"a", ""};
        System.out.println("Common Prefix: " + lcp.betterLongestCommonPrefix(words));
    }

    @Test
    public void testCase2() {
        String[] words = {"dog","racecar","car"};
        System.out.println("Common Prefix: " + lcp.longestCommonPrefix(words));
    }

    @Test
    public void testCase1() {
        String[] words = {"flower","flow","flight"};
        System.out.println("Common Prefix: " + lcp.longestCommonPrefix(words));
    }

    @Test
    public void functionalityTest() throws Exception {
        Trie trie = new Trie();
        trie.insert("programming");
        trie.insert("proportion");
        // System.out.println(trie);
        System.out.println("Common Prefix: " + trie.commonPrefix());
    }

}