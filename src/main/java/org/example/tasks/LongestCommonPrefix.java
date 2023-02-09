package org.example.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
        14. Longest Common Prefix
* */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            boolean add = true;
            if (i > strs[0].length() - 1)
                break;
            char tempChar = strs[0].charAt(i);

            for (String str : strs) {
                if (i > str.length() - 1 || tempChar != str.charAt(i))  {
                    add = false;
                    break;
                }
            }
            if (!add)
                break;
            prefix.append(tempChar);
        }
        return prefix.toString();
    }

    @Test
    public void testPositive() {
        assertEquals("fl", longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("flo", longestCommonPrefix(new String[]{"flower", "flow", "floss"}));
        assertEquals("hel", longestCommonPrefix(new String[]{"hello", "hell", "helicopter"}));
    }

    @Test
    public void testNegative() {
        assertEquals("", longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
