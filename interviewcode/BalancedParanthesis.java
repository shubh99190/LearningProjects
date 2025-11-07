import java.util.Objects;
import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String s="([)]";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Objects.equals(c, '(') || Objects.equals(c, '[') ||
                    Objects.equals(c, '{')) {
                stack.push(c);
            } else {
                char last = stack.pop();
                if (Objects.equals(c, ')') && !Objects.equals(last, '(')) {
                    return false;
                }
                if (Objects.equals(c, ']') && !Objects.equals(last, '[')) {
                    return false;
                }
                if (Objects.equals(c, '}') && !Objects.equals(last, '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
