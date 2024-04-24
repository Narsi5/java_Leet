public class SearchinRoatedSortedArray {
    public static int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);

    }
    public static int bs(int arr[], int l, int h, int key)
    {
        if (l > h)
            return -1;
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;

        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid])
                return bs(arr, l, mid - 1, key);
            return bs(arr, mid + 1, h, key);
        }

        if (key >= arr[mid] && key <= arr[h])
            return bs(arr, mid + 1, h, key);

        return bs(arr, l, mid - 1, key);
    }

    // main function
    public static void main(String args[])
    {

        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        int key = 3;
        System.out.println(search(arr,key));

    }
}
