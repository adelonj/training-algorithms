package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 1480. Running Sum of 1d Array
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.

 */
public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        int [] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i = 1; i < nums.length; i++)
            ans[i] = ans[i-1] + nums[i];
        return ans;
    }

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{1,3,6,10}, runningSum(new int[]{1,2,3,4}));
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5}, runningSum(new int[]{1,1,1,1,1}));
        Assertions.assertArrayEquals(new int[]{3,4,6,16,17}, runningSum(new int[]{3,1,2,10,1}));
    }
}
