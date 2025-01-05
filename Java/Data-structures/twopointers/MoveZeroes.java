package twopointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 4, 0, 9};

        int nextNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[nextNonZero];
                nums[nextNonZero] = tmp;
                nextNonZero++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
