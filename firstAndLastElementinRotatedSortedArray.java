public class firstAndLastElementinRotatedSortedArray {
    public int[] searchRange(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
    public  int[] bs(int arr[], int l, int h, int key)
    {
        if (l > h){
            int[] ans = new int[2];
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int mid = (l + h) / 2;
        if (arr[mid] == key){
            int[] ans = new int[2];
            int m = mid;
            int k = mid;
            while(k<h && arr[mid]==arr[k+1]  ){
                k++;
            }
            while(m>l && arr[mid]==arr[m-1]  ){
                m--;
            }
            ans[0] =m;
            ans[1] =k;
            return ans;
        }


        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid])
                return bs(arr, l, mid - 1, key);
            return bs(arr, mid + 1, h, key);
        }

        if (key >= arr[mid] && key <= arr[h])
            return bs(arr, mid + 1, h, key);

        return bs(arr, l, mid - 1, key);
    }
}
