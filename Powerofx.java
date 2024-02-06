import java.util.Scanner;

public class Powerofx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("Enter the power");
        int n = sc.nextInt();
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
//         double ans =1;
//         while(n!=0){
//             ans = ans*x;
//             n--;
//         }
//        return ans;
        return Math.pow(x,n);
    }
}
