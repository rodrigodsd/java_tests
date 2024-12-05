import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

       int[] nums = new int[]{3,2,4};
       int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }

            // Store the current number and its index in the map
            numToIndex.put(nums[i], i);
        }

        // In case there is no solution, though the problem guarantees one solution
        throw new IllegalArgumentException("No two sum solution");
    }
}
