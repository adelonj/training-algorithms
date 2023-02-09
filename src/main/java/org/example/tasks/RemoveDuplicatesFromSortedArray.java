package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return insertIndex;
    }

    @Test
    public void test() {
        Assertions.assertEquals(2, removeDuplicates(new int[]{1, 1, 2}));
        Assertions.assertEquals(3, removeDuplicates(new int[]{1, 1, 1, 3, 5, 5}));
        Assertions.assertEquals(5, removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }


}
