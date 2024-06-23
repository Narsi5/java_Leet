import java.util.Arrays;

public class MinimumAverageofSmallestandLargestElements {

        public double minimumAverage(int[] nums) {
            int size = nums.length;
            double min = 0;
            double max = 0;
            double[] averages = new double[size/2];
            for(int i = 0;i<averages.length;i++){
                min = findmin(nums);
                max = findmax(nums);
                nums=resize(nums,min);
                nums =resize(nums,max);
                averages[i] = (min+max)/2;
            }
            Arrays.sort(averages);
            return averages[0];

        }
        public int[] resize(int[] nums,double elementToRemove){

            int index = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == elementToRemove) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                for (int i = index; i < nums.length - 1; i++) {
                    nums[i] = nums[i + 1];
                }

                nums = Arrays.copyOf(nums, nums.length - 1);
            }
            return nums;
        }
        public double findmin(int[] nums){
            double min = nums[0];
            for(int i = 0;i<nums.length;i++){
                if(nums[i]<min){
                    min= nums[i];
                }
            }
            return min;
        }
        public double findmax(int[] nums){
            double max = nums[0];
            for(int i = 0;i<nums.length;i++){
                if(nums[i]>max){
                    max= nums[i];
                }
            }
            return max;
        }

}
