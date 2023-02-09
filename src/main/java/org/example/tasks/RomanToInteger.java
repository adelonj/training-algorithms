package org.example.tasks;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToInteger {
    Map<Character, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number = 0;
        char[] romansNumerals = s.toCharArray();

        for (int i = 0; i < romansNumerals.length; i++) {
            int cur = map.get(romansNumerals[i]);
            int next = 0;
            if (i != romansNumerals.length - 1)
                next = map.get(romansNumerals[i + 1]);
            if (next > cur) {
                number += next - cur;
                i++;
            } else {
                number += cur;
            }
        }
        return number;
    }

    @Test
    public void test() {
        assertEquals(3, romanToInt("III"));
        assertEquals(58, romanToInt("LVIII"));
        assertEquals(4, romanToInt("IV"));
        assertEquals(9, romanToInt("IX"));
        assertEquals(1994, romanToInt("MCMXCIV"));
    }
}
