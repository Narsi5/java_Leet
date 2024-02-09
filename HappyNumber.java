import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int n1,sum=0;
        while(n>0){
            n1=n%10;
            sum+=n1*n1;
            n=n/10;
        }
        if(sum!=4){
            if(sum==1)
                return true;
            else
                return isHappy(sum);
        }else
            return false;
    }
}
