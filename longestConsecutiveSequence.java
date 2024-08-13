import java.util.HashSet;
public class longestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int longest = 0;
        int curr = 0;
        int before = 0;
        int after = 0;
        for(int i = 0;i<nums.length;i++){
            int k = nums[i];

            if(set.remove(k)){
                before =k-1;
                after = k+1;
                curr++;
            }
            while(set.remove(before)){
                before--;
                curr++;
            }
            while(set.remove(after)){
                after++;
                curr++;
            }
            longest = Math.max(longest,curr);
            curr = 0;

        }
        return longest;
    }
}
