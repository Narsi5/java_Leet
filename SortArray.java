public class SortArray {
    public static void main(String[] args) {
        int nums[] ={5,6,4,8,9};
        sortArray(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int[] sortArray(int[] nums) {
        divide(nums,0,nums.length -1);
        return nums;
    }
    public  static void conquer(int arr[],int si,int mid,int ei){
        int merged[] = new int[ei-si +1];
        int index1 = si;
        int index2 = mid +1;
        int x = 0;
        //O(n)
        while(index1 <=mid && index2 <= ei){
            if(arr[index1]<=arr[index2]){
                merged[x++] = arr[index1++];
            }
            else{
                merged[x++] = arr[index2++];
            }
        }
        while(index1 <= mid){
            merged[x++] = arr[index1++];
        }
        while (index2<=ei){
            merged[x++]=arr[index2++];
        }
        for (int i = 0,j=si; i <merged.length ; i++,j++) {

            arr[j]=merged[i];
        }

    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //O(logn)
        int mid =si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

}
