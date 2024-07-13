import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates);
            findCombinations(0,candidates,target,ans,new ArrayList<>());
            return ans;
        }

        public void findCombinations(int index,int[] arr, int target,List<List<Integer>> ans, List<Integer> ds){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
                return;
            }

            if (index >= arr.length || target < 0) {
                return;
            }

            for (int i = index; i < arr.length; i++) {
                // Skip duplicates
                if (i > index && arr[i] == arr[i - 1]) {
                    continue;
                }
                ds.add(arr[i]);
                findCombinations(i + 1, arr, target - arr[i], ans, ds);
                ds.remove(ds.size() - 1);
            }
        }


}
