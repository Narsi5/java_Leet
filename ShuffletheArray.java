import java.util.Scanner;

public class ShuffletheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] shuffledArray = shuffle(arr, n);
        System.out.println("Shuffled array:");
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i = 0; i < 2*n; i++){
            if(i % 2 == 0) {
                result[i] = nums[i/2];
            } else {
                result[i] = nums[n+i/2];
            }
        }
        return result;
    }

}
//better time 0ms
//public int[] shuffle(int[] nums, int n) {
//    int[] result = new int[nums.length];
//    for(int i=0; i<n; i++){
//        result[2 * i] = nums[i];
//        result[2 * i + 1] = nums[n + i];
//    }
//    return result;
//}