package twopointers;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

       //int[] nums = new int[]{-1,0,1,2,-1,-4};
       //int[] nums = new int[]{0,0,0,0};
        int[] nums = new int[]{34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49};

        System.out.println(execute(nums));
    }

    public static List<List<Integer>> execute(int[] nums){

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int index = 0;

        for(int n : nums) {

            if (index > 0 && nums[index] == nums[index - 1]) {
                index++;
                continue;
            }

            int l = index + 1, r = nums.length - 1;

            while (l < r){

                int sum = n + nums[l] + nums[r];
                if (sum < 0)
                    l++;
                else if (sum > 0) {
                    r--;
                }else {
                    res.add(Arrays.asList(n, nums[l], nums[r]));
                    l++;
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }
                }
            }
            index++;
        }

        return res;
    }
}
