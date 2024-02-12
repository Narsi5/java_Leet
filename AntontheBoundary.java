import java.util.Scanner;

public class AntontheBoundary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(returnToBoundaryCount(arr));
    }
    public static int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i : nums){
            sum += i;
            if(sum == 0){
                count++;
            }

        }
        return count;
    }
}
