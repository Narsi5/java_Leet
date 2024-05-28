public class specialarray1 {
    public boolean isArraySpecial(int[] nums) {
        boolean ans= true;
        if(nums.length == 1 || nums.length == 0){
            return true;
        }
        for(int i = 0;i<nums.length-1;i++){
            if(parity(nums[i]) == parity(nums[i+1]) ){
                return false;
            }
            ans = true;
        }
        return ans;
    }
    public boolean parity(int num){
        boolean parity = false;
        if(num%2 == 0){
            parity = true;
        }
        return parity;
    }
}
