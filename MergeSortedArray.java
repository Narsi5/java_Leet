public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 0;
        int n = 1;
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1,m,nums2,n);
        for(int i = 0;i<nums1.length;i++){
            System.out.print(nums1[i]);
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            temp[i] = nums1[i];
        }
        int i = 0, j = 0;

        if (m == 0) {
            for (int z = 0; z < nums2.length; z++) {
                nums1[z] = nums2[z];
            }
        } else {
            for (int k = 0; k < m + n; k++) {
                if (i < m && j < n) {
                    if (temp[i] <= nums2[j]) {
                        nums1[k] = temp[i];
                        i++;
                    } else {
                        nums1[k] = nums2[j];
                        j++;
                    }
                } else if (i < m) {
                    nums1[k] = temp[i];
                    i++;
                } else if (j < n) {
                    nums1[k] = nums2[j];
                    j++;
                }
            }
        }
    }
}
