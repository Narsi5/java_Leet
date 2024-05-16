import java.util.HashMap;
import java.util.Map;

public class CardFlipGame {
    public int flipgame(int[] fronts, int[] backs) {
        int n = fronts.length ;
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (fronts[i] == backs[i]) {
                count.put(fronts[i], count.getOrDefault(fronts[i], 0) + 1);
            }
        }

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (!count.containsKey(fronts[i])) {
                res = Math.min(res, fronts[i]);
            }
            if (!count.containsKey(backs[i])) {
                res = Math.min(res, backs[i]);
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
