import java.util.Scanner;
//time complexity is more
public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int dividend = scanner.nextInt();
        System.out.println("Enter the divisor");
        int divisor = scanner.nextInt();
        System.out.println(divide(dividend,divisor));
    }
    public static int divide(int dividend, int divisor) {
        int count = 0;

        // when num is 0
        if (dividend == 0) {
            return 0;
        }
        //special case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(dividend == 2147483647 && divisor == -1){
            return -2147483647;
        }
//not considering both have negative sign 
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long absdividend = Math.abs((long) dividend);
        long absdivisor = Math.abs((long) divisor);

        // Perform division
        while (absdividend >= absdivisor) {
            absdividend -= absdivisor;
            count++;
        }

        // Apply the sign to the result
        return sign * count;
    }

}
