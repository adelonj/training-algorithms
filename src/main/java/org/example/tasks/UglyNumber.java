package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * <p>
 * Given an integer n, return true if n is an ugly number.
 */
public class UglyNumber {

    public boolean isUgly(int n) {
        if (n <= 0)
            return false;
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else if (n % 3 == 0)
                n = n / 3;
            else if (n % 5 == 0)
                n = n / 5;
            else
                break;
        }
        return n == 1;

    }

    @Test
    void test() {
        Assertions.assertFalse(isUgly(14));
        Assertions.assertTrue(isUgly(1));
        Assertions.assertTrue(isUgly(6));
        Assertions.assertFalse(isUgly(7));
        Assertions.assertFalse(isUgly(13));
        Assertions.assertFalse(isUgly(22));
        Assertions.assertFalse(isUgly(0));
    }


}
