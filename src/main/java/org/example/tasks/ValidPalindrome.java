package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
 * all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters
 * and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String editedSentence = s.toLowerCase();
        int start = 0, end = editedSentence.length() - 1;

        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(editedSentence.charAt(start)))
                start++;
            while (start < end && !Character.isLetterOrDigit(editedSentence.charAt(end)))
                end--;

            if (editedSentence.charAt(start) != editedSentence.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindromeShort(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }

    @Test
    void test() {
        Assertions.assertTrue(isPalindrome("A man,  a plan, a canal: Panama"));
        Assertions.assertFalse(isPalindrome("race a car"));
        Assertions.assertTrue(isPalindrome(" "));
        Assertions.assertTrue(isPalindrome("Ab, 1221, Ba"));
        Assertions.assertTrue(isPalindrome("ab_a"));
        Assertions.assertTrue(isPalindrome(".,"));
    }

    @Test
    void testShort() {
        Assertions.assertTrue(isPalindromeShort("A man,  a plan, a canal: Panama"));
        Assertions.assertFalse(isPalindromeShort("race a car"));
        Assertions.assertTrue(isPalindromeShort(" "));
        Assertions.assertTrue(isPalindromeShort("Ab, 1221, Ba"));
        Assertions.assertTrue(isPalindromeShort("ab_a"));
        Assertions.assertTrue(isPalindromeShort(".,"));
    }
}
