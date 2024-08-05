import java.util.HashMap;
public class KthDistinctString {
        public String kthDistinct(String[] arr, int k) {
            HashMap<String,Integer> map = new HashMap<>();
            int relativeorder = 0;
            for(String s : arr){
                map.put(s,map.getOrDefault(s,0)+1);
            }

            for(String s :arr){
                if(map.get(s) == 1){
                    --k;
                    if(k==0){
                        return s;
                    }

                }
            }
            return "";

        }

}
