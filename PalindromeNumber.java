import java.util.Scanner;
public class PalindromeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(isPalindrome(num));
        }

        public static boolean isPalindrome(int n) {
            int rem, sum = 0, temp;

            temp = n;
            while (n > 0) {
                rem = n % 10;  //getting remainder
                sum = (sum * 10) + rem;
                n = n / 10;
            }

            return temp == sum;
        }
    }


