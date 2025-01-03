public class NumberofWaystoSplitArray {
    public int waysToSplitArray(int[] nums) {
        int length = nums.length;
        long[] prefix = new long[length+1];
        for(int i =0;i<nums.length;i++){

            prefix[i+1] = prefix[i] + nums[i];
        }

        int count = 0;
        for(int i =0;i<length-1;i++){

            if(prefix[i+1] >= prefix[length]-prefix[i+1]){
                count++;
            }
        }
        return count;

    }
}
