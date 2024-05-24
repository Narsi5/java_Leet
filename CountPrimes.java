import java.util.Arrays;
public class CountPrimes {

        public int countPrimes(int n) {
            boolean[] isPrime = new boolean[n + 1];
            Arrays.fill(isPrime, true);

            for (int p = 2; p * p <= n; p++) {
                if (isPrime[p]) {
                    for (int i = p * p; i <= n; i += p) {
                        isPrime[i] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            return count;
        }

}
