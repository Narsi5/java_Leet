import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of steps: ");
        int n = sc.nextInt();
        System.out.println("Total no ways to climb the stairs :" + climbStairs(n));
    }
    public static int climbStairs(int n) {
//this is bascially a fibinocci series but the series goes on like this 1 2 3 5 8 13 ...
        //so by the above from 2 its fibinocci 
        //so add a if condition for 0 and 1 and rest is normal fibinooci
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
