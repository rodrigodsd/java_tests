package slidewindow;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestSubstringWithoutRepeatingCharacters {
    public void main(String[] args) {
        String s = "eghghhgg";
        Map<Character, AtomicInteger> state = new HashMap<>();
        int start = 0, max = 0;

        for (int end = 0; end < s.length(); end++) {
            state.putIfAbsent(s.charAt(end), new AtomicInteger(0));
            state.get(s.charAt(end)).incrementAndGet();

            while (state.get(s.charAt(end)).get() > 1) {
                var qtd = state.get(s.charAt(start)).decrementAndGet();
                if (qtd == 0) {
                    state.remove(s.charAt(start));
                }
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        System.out.println("max : " + max);
    }
}
