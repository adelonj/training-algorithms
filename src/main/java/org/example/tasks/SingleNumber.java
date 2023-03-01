package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {

    /*
     * Time Complexity : O(nlogn) , as there is a for loop and inside for loop 'hash.containsKey'
     * Space Complexity : O(n) , as HashMap of size nearly 'n/2' is used.
     */
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return map.entrySet().stream().filter(a -> a.getValue() == 1).findFirst().get().getKey();

    }

    @Test
    void test() {
        Assertions.assertEquals(1, singleNumber(new int[]{2, 2, 1}));
        Assertions.assertEquals(4, singleNumber(new int[]{4, 1, 2, 1, 2}));
        Assertions.assertEquals(1, singleNumber(new int[]{1}));
    }

}
