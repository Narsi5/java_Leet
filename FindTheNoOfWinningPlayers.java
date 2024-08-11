import java.util.HashMap;
import java.util.Map;

public class FindTheNoOfWinningPlayers {
    public static int countWinningPlayers(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];

            Map<Integer, Integer> colour = map.computeIfAbsent(player, k -> new HashMap<>());
            colour.put(color, colour.getOrDefault(color, 0) + 1);
        }

        int winners = 0;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map1 = map.getOrDefault(i, new HashMap<>());

            for (int count : map1.values()) {
                if (count > i) {
                    winners++;
                    break;
                }
            }

        }

        return winners;
    }
}
