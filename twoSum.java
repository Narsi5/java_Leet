import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.printf("Enter %d numbers: ", n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the target sum you want to achieve:");
        int target = scanner.nextInt();
        int[] result = twoOfSum(arr, target);

        System.out.println("indeces of first no " + result[0] +" indices of 2nd no " + result[1]);
    }
    public static int[] twoOfSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
