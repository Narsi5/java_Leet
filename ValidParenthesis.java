import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis {

    public boolean checkValidString(String inputStr)
    {
        Stack<Character> stk = new Stack<Character>();
 
        for (char ch : inputStr.toCharArray())
        {

            if (ch == '(')
            {
                stk.push(')');
            }
            else if (ch == '{')
            {
                stk.push('}');
            }
            else if (ch == '[')
            {
                stk.push(']');
            }

            else if (stk.isEmpty() || stk.pop() != ch)
            {
                return false;
            }
        }
        return stk.isEmpty();
    }

    // main method
    public static void main(String argvs[])
    {

        ValidParenthesis obj = new ValidParenthesis();
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();

        boolean isValidString = obj.checkValidString(inputStr);

        if(isValidString)
        {
            System.out.println("The string \"" + inputStr + "\" is a valid string.");
        }
        else
        {
            System.out.println("The string \"" + inputStr + "\" is not a valid string.");
        }

        System.out.println( );



    }

}
