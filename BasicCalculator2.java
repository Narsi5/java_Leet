import java.util.Stack;

public class BasicCalculator2 {
    public int calculate(String s) {
        int num = 0;
        Stack<Integer> stk = new Stack<>();
        char operator = '+';
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = ch[i];
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                if (operator == '+') {
                    stk.push(num);
                } else if (operator == '-') {
                    stk.push(-num);
                } else if (operator == '*') {
                    stk.push(stk.pop() * num);
                } else if (operator == '/') {
                    stk.push(stk.pop() / num);
                }
                operator = c;
                num = 0;
            }
        }
        int res = 0;
        while (!stk.isEmpty()) {
            res += stk.pop();
        }
        return res;
    }
}
