package org.example.tasks;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRoman {

    TreeMap<Integer, String> map = new TreeMap<>();

    public String intToRoman1(int num) {
        StringBuilder sb = new StringBuilder();
        while (num >= 1000) {
            sb.append('M');
            num -= 1000;
        }
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");

        while (num > 0) {
            Map.Entry<Integer, String> floor = map.floorEntry(num);
            sb.append(floor.getValue());
            num -= floor.getKey();
        }
        return sb.toString();
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        if (num >= 1000) {
            while (num > 999) {
                sb.append('M');
                num -= 1000;
            }
        }
        if (num >= 900) {
            sb.append("CM");
            num -= 900;
        }
        if (num >= 500) {
            sb.append("D");
            num -= 500;
        }
        if (num >= 400) {
            sb.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            sb.append('C');
            num -= 100;
        }
        while (num >= 90) {
            sb.append("XC");
            num -= 90;
        }
        if (num >= 50) {
            sb.append('L');
            num -= 50;
        }
        if (num >= 40) {
            sb.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            sb.append('X');
            num -= 10;
        }
        if (num == 9) {
            sb.append("IX");
            num -= 9;
        }
        if (num >= 5) {
            sb.append("V");
            num -= 5;
        }
        if (num == 4) {
            sb.append("IV");
            num -= 4;
        }
        while (num > 0) {
            sb.append('I');
            num -= 1;
        }
        return sb.toString();
    }

    @Test
    public void test() {
        assertEquals("II", intToRoman(2));
        assertEquals("III", intToRoman(3));
        assertEquals("IV", intToRoman(4));
        assertEquals("VII", intToRoman(7));
        assertEquals("VIII", intToRoman(8));
        assertEquals("IX", intToRoman(9));
        assertEquals("XIV", intToRoman(14));
        assertEquals("LVIII", intToRoman(58));
        assertEquals("MCMXCIV", intToRoman(1994));
        assertEquals("XL", intToRoman(40));
        assertEquals("XLVIII", intToRoman(48));
        assertEquals("LI", intToRoman(51));
        assertEquals("DI", intToRoman(501));
        assertEquals("CDI", intToRoman(401));
    }
}
