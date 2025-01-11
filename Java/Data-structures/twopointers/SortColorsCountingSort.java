package twopointers;

import java.util.Arrays;

public class SortColorsCountingSort {

    public void main(String[] args) {
        int[] nums = new int[]{2, 1, 2, 0, 1, 0, 1, 0, 1};

        int min = Arrays.stream(nums).min().orElse(0);
        int max = Arrays.stream(nums).max().orElse(Integer.MAX_VALUE);

        int size = max - min;

        int[] count = new int[size + 1];

        if (nums.length <= 1) {
            System.out.println(Arrays.toString(nums));
            return; // Nada para ordenar se o array tiver 0 ou 1 elemento
        }

        for (int n : nums) {
            count[n - min]++;
        }

        int index = 0;
        for (int i = 0; i < size + 1 ; i++) {
            while (count[i] > 0) {
                nums[index] = i + min;
                count[i]--;
                index++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
