public class MinimumMovestoEqualSum {
    public int minMoves(int[] nums) {
        int moves = 0;
        int min = nums[0];
        //finding minimum
        for(int i = 0;i<nums.length ;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }

        //making all others to min
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=min){
                moves = moves + (nums[i] -min);
            }
        }
        return moves;


    }
}
