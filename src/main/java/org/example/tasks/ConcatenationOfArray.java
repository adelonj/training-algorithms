package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 1929. Concatenation of Array
 * <p>
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, ans is the concatenation of two nums arrays.
 * <p>
 * Return the array ans.
 */
public class ConcatenationOfArray {


    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[j++];
            if (j == nums.length)
                j = 0;
        }
        return arr;
    }

    @Test
    public void test() {
        Assertions.assertArrayEquals(getConcatenation(new int[]{1, 2, 3, 5, 6}), new int[]{1,2,3,5,6,1,2,3,5,6});
    }
}
