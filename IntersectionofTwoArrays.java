import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {2,2,3};
        int[] result = intersection(nums1, nums2);

        // Printing the intersection elements
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }


    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length ; i++) {
         if(set.contains(nums2[i])){
             ans.add(nums2[i]);
         }
        }

        int[] aans = new int[ans.size()];
        int index = 0;
        for (int num : ans) {
            aans[index] = num;
            index++;
        }
        return aans;
    }
}
