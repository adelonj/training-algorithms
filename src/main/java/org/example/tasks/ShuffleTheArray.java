package org.example.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShuffleTheArray {

    /*
    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
     */
    public int[] shuffle(int[] nums, int n) {

        int size = nums.length;
        int[] result = new int[size];
        int k = 0; // index for original array
        for (int i = 0; i < size - 1; i++, k++) {
            result[i] = nums[k];
            for (int j = k + n; j < size; j += n) {
                result[++i] = nums[j];
            }
        }
        return result;
    }

    @Test
    void test() {
        assertArrayEquals(new int[]{1, 4, 7, 2, 5, 8, 3, 6, 9}, shuffle(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3));
        assertArrayEquals(new int[]{1, 3, 2, 4}, shuffle(new int[]{1, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{}, shuffle(new int[]{}, 2));
        assertArrayEquals(new int[]{1, 2, 3}, shuffle(new int[]{1, 2, 3}, 1));
    }

}
