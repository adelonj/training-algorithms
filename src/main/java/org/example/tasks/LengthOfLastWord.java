package org.example.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {


//    public int lengthOfLastWord(String s) {
//        String[] arr = s.trim().split(" ");
//        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
//
//        return arr[arr.length-1].length();
//    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {
                if (length > 0) return length;
            }
        }
        return length;
    }

    @Test
    void test() {
        assertEquals(5, lengthOfLastWord("Hello World"));
        assertEquals(4, lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, lengthOfLastWord("luffy is still joyboy"));
    }
}
