package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */
public class AddDigits {
    public int addDigits(int num) {
        int a = num / 10;
        int b = num % 10;

        if (a == 0)
            return num;

        return addDigits(a+b);
    }
    public int addDigitsMaths(int num) {
        if (num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }

    @Test
    void test() {
        Assertions.assertEquals(2, addDigits(38));
        Assertions.assertEquals(0, addDigits(0));
        Assertions.assertEquals(4, addDigits(121));
        Assertions.assertEquals(6, addDigits(555));
    }

    @Test
    void testMathMethod() {
        Assertions.assertEquals(2, addDigitsMaths(38));
        Assertions.assertEquals(0, addDigitsMaths(0));
        Assertions.assertEquals(4, addDigitsMaths(121));
        Assertions.assertEquals(6, addDigitsMaths(555));
    }
}
