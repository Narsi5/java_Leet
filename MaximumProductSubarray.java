public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        double[] maxProd = new double[n];
        double[] minProd = new double[n];

        maxProd[0] = nums[0];
        minProd[0] = nums[0];

        double maxProduct = nums[0];

        for (int i = 1; i < n; i++) {
            maxProd[i] = Math.max(nums[i], Math.max(nums[i] * maxProd[i-1], nums[i] * minProd[i-1]));
            minProd[i] = Math.min(nums[i], Math.min(nums[i] * maxProd[i-1], nums[i] * minProd[i-1]));
            maxProduct = Math.max(maxProduct, maxProd[i]);
        }


        return (int)maxProduct;

    }
}
