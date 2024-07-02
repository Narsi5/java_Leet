import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoarr {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i = 0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i], 0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for(int j = 0;j<nums2.length;j++){
            if(map1.containsKey(nums2[j])){
                ans.add(nums2[j]);

                int currentValue = map1.get(nums2[j]);
                int updatedValue = currentValue-1;

                if (updatedValue > 0) {
                    map1.put(nums2[j], updatedValue);
                } else {
                    map1.remove(nums2[j]);
                }

            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0;i<ans.size();i++){
            res[i]= ans.get(i);
        }
        return res;
    }
}
