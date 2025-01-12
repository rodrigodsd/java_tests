package twopointers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortColorsTwoPointers {

    public void main(String[] args) {
        int[] nums = new int[]{2, 1, 2, 0, 1, 0, 1, 0, 1};
        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());

        int left = 0, right = nums.length - 1, i = 0;

        while (i <= right) {
            if (list.get(i) == 0) {
                Collections.swap(list, i, left);
                left++;
                i++;
            } else if (list.get(i) == 2) {
                Collections.swap(list, i, right);
                right--;
            } else {
                i++;
            }
        }

        System.out.println(list);
    }
}
