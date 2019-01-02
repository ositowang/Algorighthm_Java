import java.util.Stack;

public class reversePolish {
    private reversePolish() {
    };

    public int evalRPN(String[] tokens) {
        int result = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.add(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch (index) {
                case 0:
                    stack.add(String.valueOf(a + b));
                    break;
                case 1:
                    stack.add(String.valueOf(b - a));
                    break;
                case 2:
                    stack.add(String.valueOf(a * b));
                    break;
                case 3:
                    stack.add(String.valueOf(b / a));
                    break;
                }
            }
        }
        result = Integer.valueOf(stack.pop());
        return result;
    }
}