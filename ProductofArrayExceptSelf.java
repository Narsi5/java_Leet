public class ProductofArrayExceptSelf {
    //Intution approch but it takes of O(n^2) time complexity
//    public int[] productExceptSelf(int[] nums) {
//        int[] arr = new int[nums.length];
//        int i = 0;
//        while(i<nums.length){
//            if(nums.length == 1 || nums.length == 0){
//                return nums;
//            }
//
//            arr[i] = leftProduct(nums,i) * rightProduct(nums,i);
//            i++;
//
//        }
//        return arr;
//
//    }
//    public int leftProduct(int[] nums,int ln){
//        int result = 1;
//        for(int i = 0;i<ln ;i++){
//            result = result*nums[i];
//        }
//        return result;
//
//    }
//    public int rightProduct(int[] nums,int ln){
//        int result = 1;
//        for(int i = ln+1;i<nums.length ;i++){
//            result = result*nums[i];
//        }
//        return result;
//    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProducts = new int[n];
        //left side
        leftProduct[0]=1;
        for(int i=1;i<n;i++){
            leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }
        //right side
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        for(int i = 0;i<n;i++){
            nums[i] = leftProduct[i]*rightProducts[i];
        }
        return nums;
    }


}
