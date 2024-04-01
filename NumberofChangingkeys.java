import java.util.Scanner;

public class NumberofChangingkeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int result = countKeyChanges(s);
        System.out.println("No of Key changes :"+result);
    }
    public static int countKeyChanges(String s) {
        int count = 0;
        String lc = s.toLowerCase();
        for(int i = 1;i<lc.length();i++){
            if(lc.charAt(i-1)!=lc.charAt(i)){
                count++;
            }
        }

        return count;

    }
}
