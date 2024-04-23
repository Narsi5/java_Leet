import java.util.Scanner;

public class TwoSum2_inputarrayissorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();

        twoSum(arr,target);

    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for(int i = 0;i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j] == target){
                    arr[0] = i+1;
                    arr[1] = j+1;
                    return arr;
                }
            }
        }
        return arr;
    }
}
