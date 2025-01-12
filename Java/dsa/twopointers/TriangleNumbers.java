package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangleNumbers {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 3, 4};
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int index = nums.length - 1; index >= 1; index--) {


            // set two pointers
            int left = 0, right = index - 1;

            while (left < right) {

                if (nums[left] + nums[right] > nums[index]) {
                    res.add(List.of(nums[left], nums[right], nums[index]));
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(" values : " + res);
    }
}
