import java.util.Stack;
public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (String dirname : path.split("/")) {
            if (dirname.equals("..")) {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } else if (!dirname.isEmpty() && !dirname.equals(".")) {
                stk.push(dirname);
            }
        }

        for (String ch : stk) {
            sb.append("/");
            sb.append(ch);
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}
