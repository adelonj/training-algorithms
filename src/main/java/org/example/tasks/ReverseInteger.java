package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseInteger {

    public int reverse1(int x) {
        boolean isNegative = x < 0;
        // x to positive
        if (isNegative)
            x = x * -1;

        long result = 0;
        if (x / 10 == 0)
            return x;

        int num = x;

        while (num != 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }

        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0
                : isNegative ? (int) (result * -1) : (int) result;
    }


    public int reverse2(int x) {
        long result = 0;
        while (x != 0) {
            result = (result * 10) + (x % 10);
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
            x = x / 10;
        }
        return (int) result;
    }

    public int reverse3(int x) {
        String s = String.valueOf(x);
        StringBuilder strRes = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0 && s.charAt(i) == '-') {
                strRes.insert(0, "-");
                break;
            }
            strRes.append(s.charAt(i));
        }

        long result = Long.parseLong(strRes.toString());
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0
                : (int) result;

    }


    @Test
    void test1() {
        Assertions.assertEquals(123, reverse1(321));
        Assertions.assertEquals(-123, reverse1(-321));
        Assertions.assertEquals(21, reverse1(120));
        Assertions.assertEquals(0, reverse1(1534236469));
        Assertions.assertEquals(0, reverse1(-2147483648));
    }

    @Test
    void test2() {
        Assertions.assertEquals(123, reverse2(321));
        Assertions.assertEquals(-123, reverse2(-321));
        Assertions.assertEquals(21, reverse2(120));
        Assertions.assertEquals(0, reverse2(1534236469));
        Assertions.assertEquals(0, reverse2(-2147483648));
    }

    @Test
    void test3() {
        Assertions.assertEquals(123, reverse3(321));
        Assertions.assertEquals(-123, reverse3(-321));
        Assertions.assertEquals(21, reverse3(120));
        Assertions.assertEquals(0, reverse3(1534236469));
        Assertions.assertEquals(0, reverse3(-2147483648));
    }
}
