package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a string s consisting of lowercase English letters, and an integer k.
 * <p>
 * First, convert s into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.
 * <p>
 * For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:
 * <p>
 * Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
 * Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
 * Transform #2: 17 ➝ 1 + 7 ➝ 8
 * Return the resulting integer after performing the operations described above.
 */
public class SumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        // get first sum
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a' + 1; // example char = b: 'b'- 'a'+ 1 = 66 - 65 + 1 = 2
            sum += a % 10;
            if (a / 10 > 0) {
                sum += a / 10;
            }
        }
        //  need repeat ? - do it
        while (k > 1) {
            s = String.valueOf(sum);
            sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += Character.getNumericValue(s.charAt(i));
            }
            k--;
        }
        return sum;
    }

    @Test
    void test() {
        Assertions.assertEquals(36, getLucky("iiii", 1));
        Assertions.assertEquals(6, getLucky("leetcode", 2));
        Assertions.assertEquals(8, getLucky("zbax", 2));
    }
}
