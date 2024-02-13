import java.util.Scanner;

public class TypeofTriangletwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(triangleType(nums));
    }

    public static String triangleType(int[] nums) {


        if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
            if (nums[0] == nums[1] && nums[0] == nums[2]) {
                return  "equilateral";
            } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
                return "isosceles";
            } else {
                return "scalene";
            }
        } else {
            return "none";
        }

}

}
