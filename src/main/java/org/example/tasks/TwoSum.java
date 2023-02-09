package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        while (index < nums.length) {
            int i = index;
            for (; i < nums.length - 1; i++) {
                if (nums[index] + nums[i + 1] == target) {
                    return new int[]{index, i + 1};
                }
            }
            index++;
        }
        return null;
    }

    @Test
    public void test() {
        Assertions.assertArrayEquals(twoSum(new int[]{3, 5, 8, 4}, 9), new int[]{1, 3});
        Assertions.assertArrayEquals(twoSum(new int[]{50, 1, 22, 10}, 72), new int[]{0, 2});
        Assertions.assertArrayEquals(twoSum(new int[]{2, 0, 1, 9, 7}, 7), new int[]{1, 4});
        Assertions.assertArrayEquals(twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        Assertions.assertArrayEquals(twoSum(new int[]{2, 7, 11, 15, 4}, 19), new int[]{3, 4});
    }
}
