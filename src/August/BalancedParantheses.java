package August;


import java.util.HashMap;
import java.util.Deque;
import java.util.Map;
import java.util.ArrayDeque;
public class BalancedParantheses {
    public static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (bracketMap.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != bracketMap.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()"));          // true
        System.out.println(isBalanced("()[]{}"));      // true
        System.out.println(isBalanced("(]"));          // false
        System.out.println(isBalanced("([)]"));        // false
        System.out.println(isBalanced("{[]}"));        // true
        System.out.println(isBalanced(""));            // true
        System.out.println(isBalanced("a(b)c"));       // true
    }
}
