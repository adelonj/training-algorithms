package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * - Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * - Those numbers for which this process ends in 1 are happy.
 * <p>
 * Return true if n is a happy number, and false if not.
 */

public class HappyNumber {

//    public boolean isHappy(int n) {
//        int sum = 0;
//
//        while (true) {
//            char[] digits = String.valueOf(n).toCharArray();
//            if (digits.length < 2)
//                break;
//
//            for (int digit : digits) {
//                digit = Character.getNumericValue(digit);
//                sum += digit * digit;
//            }
//            n = sum;
//            if (n > 9)
//                sum = 0;
//        }
//        return n == 1 || n == 7;
//    }


    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    @Test
    void test() {
        assertTrue(isHappy(19));
        assertFalse(isHappy(2));
        assertFalse(isHappy(9));
        assertTrue(isHappy(7));
        assertTrue(isHappy(13));
    }
}
