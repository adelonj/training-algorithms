package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseString {


    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        for (; start < end; start++, end--) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }
    }

    @Test
    void test() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        Assertions.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, chars);

        char[] chars2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(chars2);
        Assertions.assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, chars2);

    }
}
