import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LongestConsecutive {

    public void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};

        List numsSet = Arrays.stream(nums).boxed().toList();

        int longestStreak = 0;
        for (int n : nums) {

            if (!numsSet.contains(n - 1)) {
                int current_num = n;
                int currentStreak = 1;

                while (numsSet.contains(current_num + 1)) {
                    current_num++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }


        System.out.println("longestStreak : " + longestStreak);
    }
}
