import java.util.Arrays;

public class MergeSort {

    public void main(String[] args) {
        int[] nums = new int[]{3, 7, 6, -10, 15, 23, 55, -13};

        int[] result = sort(nums);

        System.out.println("nums : " + Arrays.toString(result));
    }

    private int[] sort(int[] nums) {

        if (nums.length <= 1)
            return nums;

        int middleIdx = (nums.length) / 2;

        int[] numsLeft = Arrays.copyOfRange(nums, 0, middleIdx);
        int[] numsRight = Arrays.copyOfRange(nums, middleIdx, nums.length);

        System.out.println("numsLeft : " + Arrays.toString(numsLeft) + " ||||  numsRight:" + Arrays.toString(numsRight));

        int[] numsLeftSorted = sort(numsLeft);
        int[] numsRightSorted = sort(numsRight);

        return merge(numsLeftSorted, numsRightSorted);
    }

    private int[] merge(int[] numsLeft, int[] numsRight) {
        int[] result = new int[numsLeft.length + numsRight.length];

        int i = 0, j = 0, k = 0;

        while (i < numsLeft.length && j < numsRight.length) {

            if (numsLeft[i] < numsRight[j]) {
                result[k++] = numsLeft[i++];
            } else {
                result[k++] = numsRight[j++];
            }
        }

        while (i < numsLeft.length) {
            result[k++] = numsLeft[i++];
        }

        while (j < numsRight.length) {
            result[k++] = numsRight[j++];
        }

        return result;
    }

}
