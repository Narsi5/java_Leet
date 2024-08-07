public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = ms;

        for(int i=1; i<nums.length; i++){
            cs = Math.max(nums[i] + cs, nums[i]);
            ms = Math.max(cs, ms);
        }
        return ms;
    }
}
