import java.util.Stack;

public static String isBalanced(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);

        if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
            stack.push(currentChar);
        } else {
            if (stack.isEmpty()) {
                return "NO";
            }

            char top = stack.pop();

            if ((currentChar == ')' && top != '(') ||
                (currentChar == ']' && top != '[') ||
                (currentChar == '}' && top != '{')) {
                return "NO";
            }
        }
    }

    return stack.isEmpty() ? "YES" : "NO";
}
