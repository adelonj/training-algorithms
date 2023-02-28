package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an integer num, return the number of digits in num that divide num.
 * <p>
 * An integer val divides nums if nums % val == 0.
 */
public class CountTheDigitsThatDivideANumber {

    //  Time complexity: O(n)
    //  Space complexity: O(1)
    public int countDigits(int num) {
        int result = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            if (num % digit == 0)
                result++;
            temp = temp / 10;
        }
        return result;
    }

    @Test
    void test() {
        Assertions.assertEquals(1, countDigits(7));
        Assertions.assertEquals(2, countDigits(121));
        Assertions.assertEquals(4, countDigits(1248));
    }

}