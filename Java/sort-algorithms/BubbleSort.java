import java.util.Arrays;

public class BubbleSort {

    public void main(String[] args) {
        int[] nums = new int[]{ 64, 34, 25, 12, 22, 11, 90 };

        for (int i = 0; i < nums.length - 1 ; i++) {

            for (int j = 0; j < nums.length - 1 ; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(j, j + 1, nums);
                }
            }

        }
        System.out.println("nums : " + Arrays.toString(nums));
    }

    private void swap(int indexHigh, int indexLow, int[] nums) {
        int tmpValue = nums[indexHigh];
        nums[indexHigh] = nums[indexLow];
        nums[indexLow] = tmpValue;
    }
}
