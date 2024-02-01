import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int k = scanner.nextInt();
        int[] arr;
        arr = new int[k];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
        int[] result = plusOneArr(arr);
        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


    public static int[] plusOneArr(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            //if the last digit is less than zero then it will increase the last digit and return and exit the loop ,same till the digit is less than 9 
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
// this will only executed when the mostsignigicant bit is 9 
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
