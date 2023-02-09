package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumII {

    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        if (target > nums[end / 2])
            start = end / 2;

        while (start < end) {
            if (target - nums[start] < nums[start])
                start = 0;
            for (int i = start; i < end - 1; i++) {
                if (nums[start] + nums[i + 1] == target)
                    return new int[]{++start, ++i + 1};
            }
            start++;
        }
        return null;
    }

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{2, 3}, twoSum(new int[]{3, 4, 5, 8, 10, 16, 20}, 9));
        Assertions.assertArrayEquals(new int[]{5, 7}, twoSum(new int[]{3, 4, 5, 8, 10, 16, 20}, 30));
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSum(new int[]{-1, 0}, -1));
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSum(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 3}, twoSum(new int[]{2, 3, 4}, 6));
        Assertions.assertArrayEquals(new int[]{4, 5}, twoSum(new int[]{1, 2, 3, 4, 4, 9, 56, 90}, 8));
    }
}
