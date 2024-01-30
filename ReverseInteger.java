import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        //scan the integer
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(reverse(n));
    }
    public static int reverse(int x) {
        long normal_num = 0;

        while (x != 0) {
            normal_num = normal_num * 10 + x % 10;
            x /= 10;
        }

        return (normal_num < Integer.MIN_VALUE || normal_num > Integer.MAX_VALUE) ? 0 : (int) normal_num;
    }
}
