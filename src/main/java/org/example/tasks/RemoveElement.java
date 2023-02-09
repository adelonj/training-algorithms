package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    @Test
    public void test() {
        Assertions.assertEquals(2, removeElement(new int[]{3, 2, 2, 3}, 3));
        Assertions.assertEquals(5, removeElement(new int[]{1, 1, 1, 3, 5, 5}, 3));
        Assertions.assertEquals(7, removeElement(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 1));
    }
}






