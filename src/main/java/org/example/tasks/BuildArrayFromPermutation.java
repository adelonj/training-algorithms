package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 1920. Build Array from Permutation
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 *
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */
public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    @Test
    public void test() {
        Assertions.assertArrayEquals(buildArray(new int[]{0,2,1,5,3,4}), new int[]{0,1,2,4,5,3});
        Assertions.assertArrayEquals(buildArray(new int[]{5,0,1,2,3,4}), new int[]{4,5,0,1,2,3});
    }
}
