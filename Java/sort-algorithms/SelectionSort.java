import java.util.Arrays;

public class SelectionSort {

    public void main(String[] args) {
        int[] nums = new int[]{64, 25, 12, 22, 11};

        for (int i = 0; i < nums.length; i++) {
            // Assume the current position holds
            // the minimum element
            int indexMin = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[indexMin]) {
                    indexMin = j;
                }
            }
            swap(i, indexMin, nums);
        }
        System.out.println("nums : " + Arrays.toString(nums));
    }

    private void swap(int indexHigh, int indexLow, int[] nums) {
        int tmpValue = nums[indexHigh];
        nums[indexHigh] = nums[indexLow];
        nums[indexLow] = tmpValue;
    }
}
