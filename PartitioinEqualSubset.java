public class PartitioinEqualSubset {
    public boolean canPartition(int[] nums) {
        //cum sum
        int csum = 0;
        for(int i = 0;i<nums.length;i++){
            csum += nums[i];
        }
        if(csum%2 !=0 ){
            return false;
        }
        return subsetSum(nums,csum/2);

    }
    public static boolean subsetSum(int[] nums, int target) {
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        //empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {

                if (nums[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        int count = 0;
        for(int i = 0;i<=n;i++){
            if(dp[i][target] == true){
                count++;
            }
        }
        if(count>=2){
            return true;
        }else{
            return false;
        }
    }
}
