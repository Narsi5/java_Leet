import java.util.ArrayList;
import java.util.List;

public class CountNoOfDominantOnes {

    public int numberOfSubstrings(String s) {
        int n = s.length();

        int[] noofones = new int[n + 1];
        int[] noOfzeros = new int[n + 1];

        for (int i = 0; i < n; ++i) {
            noofones[i + 1] = noofones[i] + (s.charAt(i) == '1' ? 1 : 0);
            noOfzeros[i + 1] = noOfzeros[i] + (s.charAt(i) == '0' ? 1 : 0);
        }

        int count = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                int ones = noofones[j + 1] - noofones[i];
                int zeros = noOfzeros[j + 1] - noOfzeros[i];

                if (ones >= zeros * zeros) {
                    ++count;
                }
            }
        }

        return count;
    }

}
