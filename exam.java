public class exam {

    public static Map<Integer, Integer> getPrimeFactors(int n) {
        Map<Integer, Integer> factors = new HashMap<>();
        // Handle factor of 2
        while (n % 2 == 0) {
            factors.put(2, factors.getOrDefault(2, 0) + 1);
            n /= 2;
        }
        // Handle odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        // If n is a prime number greater than 2
        if (n > 2) {
            factors.put(n, factors.getOrDefault(n, 0) + 1);
        }
        return factors;
    }

    // Method to calculate the weighted sum based on prime factors
    public static int calculateWeightedSum(int[] arr, int nu) {
        Map<Integer, Integer> factors = getPrimeFactors(nu);
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
            int prime = entry.getKey();
            int exponent = entry.getValue();
            // Ensure the prime index is within bounds
            if (prime < arr.length) {
                sum += exponent * arr[prime];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 11, 13, 17, 19, 23, 29, 31};
        int nu = 30;
        int result = calculateWeightedSum(arr, nu);
        System.out.println("Weighted sum: " + result);
    }
}
