package org.example.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * <p>
 * Constrains:
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 */
public class ValidPalindromeII {


    /*
       Time complexity: O(N)
       Space: O(1)
    */
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        for (; start < end; start++, end--) {
            if (s.charAt(start) != s.charAt(end)) {
                return isPalindromeOffset(s, start, --end) || isPalindromeOffset(s, ++start, ++end);
            }
        }
        return true;
    }

    private boolean isPalindromeOffset(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    @Test
    void test() {
        assertTrue(validPalindrome("aba"));
        assertTrue(validPalindrome("abca"));
        assertFalse(validPalindrome("abc"));
        assertFalse(validPalindrome("cba"));
        assertTrue(validPalindrome("abas"));
        assertTrue(validPalindrome("sabas"));
        assertTrue(validPalindrome("saba"));
        assertTrue(validPalindrome("abhbas"));
        assertTrue(validPalindrome("test"));
        assertTrue(validPalindrome("mama"));
        assertTrue(validPalindrome("a"));
        assertTrue(validPalindrome("ebcbbececabbacecbbcbe"));
        assertFalse(validPalindrome("atbbga"));
    }
}