package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumber {


    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start = start + 1;
            end = end - 1;
        }
        return true;
    }

    @Test
    public void test(){
        Assertions.assertFalse(isPalindrome(100));
        Assertions.assertFalse(isPalindrome(234));
        Assertions.assertFalse(isPalindrome(12129393));
        Assertions.assertTrue(isPalindrome(0));
        Assertions.assertTrue(isPalindrome(7890987));
    }
}
