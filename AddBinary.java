import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Binary String a : ");
        String a= sc.nextLine();
        System.out.prnt("Enter Binary String b : ");
        String b= sc.nextLine();
        System.out.println(add(a, b));

    }
    public static String add(String a, String b) {
        //        sum   carry
        // 0+0     0      0
        // 0+1     1      0
        // 1+0     1      0
        // 1+1     0      1

        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) { 
                sum += a.charAt(i) - '0';//if the digit is 0 the sum will become 1 and if the digit is 0 then the sum will remain 0
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';//if the digit is 0 the sum will become previou sum result + 1 and if the digit is 0 then the sum will become previous sum result +0
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);//it will 0 or 1 depending on the the sum to the result String 
                carry = 0;//as sum is 1or 0 from the above table we can make carry =0 
            }
            else if (sum == 2) {
                result.append("0");//if sum is 2 it means it is 1+1 case so we will have carry = 1 and in the result string 0 will be added
                carry = 1;
            }
            else {
                //this is when u have to add 1+1 and have a carry from previous as 1
                //example : 11
                //         +11
                //         110 
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {// after adding all if have a carry then we hae to add to the result string
            result.append("1");
        }
        return result.reverse().toString();//this will reverse the string and print

    }
}
