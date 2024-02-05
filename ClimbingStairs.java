import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of steps: ");
        int n = sc.nextInt();
        System.out.println("The no of steps required are :" + climbStairs(n));
    }
    public static int climbStairs(int n) {

        int fno=1,sno=2,nno;

        if(n==0)
            return 0;
        if(n==1)
            return 1;

        for (int i =3;i<=n;i++){
            nno=fno+sno;
            fno=sno;
            sno=nno;
        }
        return sno;
    }
}
