package org.example.tasks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */
public class FizzBuzz {

    /*
        Time Complexity: O(N)
        Space Complexity: O(1)
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0)
                sb.append("Fizz");
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            list.add(sb.isEmpty() ? String.valueOf(i) : sb.toString());
        }
        return list;
    }

    /*
        Time Complexity: O(N)
        Space Complexity: O(1)
     */
//    public List<String> fizzBuzz(int n) {
//        List<String> list = new ArrayList<>(n);
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//                list.add("FizzBuzz");
//            else if (i % 3 == 0)
//                list.add("Fizz");
//            else if (i % 5 == 0)
//                list.add("Buzz");
//            else
//                list.add(String.valueOf(i));
//        }
//        return list;
//    }

    @Test
    void test() {
        Assertions.assertEquals(List.of("1", "2", "Fizz"), fizzBuzz(3));
        Assertions.assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), fizzBuzz(5));
        Assertions.assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), fizzBuzz(15));
    }

}
