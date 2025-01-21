package slidewindow;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FruitIntoBaskets {

    public void main(String[] args) {
        int[] nums = new int[]{3, 3, 1, 2, 1, 1, 2, 3, 4};
        int start = 0, max = 0;
        Map<Integer, AtomicInteger> state = new HashMap<>();

        for (int end = 0; end < nums.length; end++) {
            state.putIfAbsent(nums[end], new AtomicInteger(0));
            state.get(nums[end]).incrementAndGet();

            while (state.size() > 2) {
                var qtd = state.get(nums[start]).decrementAndGet();
                if (qtd == 0) {
                    state.remove(nums[start]);
                }
                start++;
            }

            max = Math.max(max, end - start + 1);

        }

        System.out.println("max : " + max);

    }
}