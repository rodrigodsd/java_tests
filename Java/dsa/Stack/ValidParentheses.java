package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String s = "()[]{}";

        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (Character c : s.toCharArray()) {
            if (mapping.containsValue(c)) {
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.peek()) {
                    System.out.println("valid : false");
                    return;
                }
                stack.pop();
            }
        }
        System.out.println("valid : " + (stack.size() == 0));
    }
}
