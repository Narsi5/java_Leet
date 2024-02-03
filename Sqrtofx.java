import java.util.Scanner;

public class Sqrtofx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        int num = x;
        int count =0;
        for(int i=1;i<=(x/2)+1;i=i+2) {
            num = num - i;//this is a simple method where u subract by odd numbersg
            if (num < 0) {
                break;
            }
            count++;

        }
        return count;
    }

}
