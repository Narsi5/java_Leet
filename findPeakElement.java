public class findPeakElement {
    public int find(int[] nums) {
        if(nums.length == 1) return 0; // single element

        int n = nums.length;

        // check if 0th/n-1th index is the peak element
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        // search in the remaining array
        int l = 1;
        int h = n-2;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid-1]){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return h;
    }
}
