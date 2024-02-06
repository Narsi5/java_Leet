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
//         double ans =1; //this code works well but the time complexity and space complexity is more and hence is not advisable 
//         while(n!=0){
//             ans = ans*x;
//             n--;
//         }
//        return ans;
        return Math.pow(x,n);//this is the easiest way as it is a inbuilt function
    }
 }

//  public double myPow(double x, int n) {
//         long N = n ;
//         if(n < 0) {
//             x = 1/x;
//             N = -n;
//         }
//         return helper(x, N);
//     }

//     private double helper(double x, long n) {
//         if(n==0) {
//             return 1.0;
//         }

//         double result = helper(x, n/2);
//         if(n %2 == 0) {
//             return result * result;
//         } else {
//             return result * result * x;
//         }
//     }
