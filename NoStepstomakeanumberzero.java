import java.util.Scanner;

public class NoStepstomakeanumberzero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(numberOfSteps(number));

    }
    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                steps++;
            } else {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }
}
