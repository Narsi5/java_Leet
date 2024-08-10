public class MinimumNumberofFlipsToMakeABinaryGridPaliindrome {
    public static void main(String[] args) {
        MinimumNumberofFlipsToMakeABinaryGridPaliindrome solver = new MinimumNumberofFlipsToMakeABinaryGridPaliindrome();

        // Example grid
        int[][] grid1 = {
                {0, 1},
                {0, 1},
                {0, 0}
        };

        // Test case 1
        int result1 = solver.minFlips(grid1);
        System.out.println("Minimum flips for grid1: " + result1);

        // Another example grid
        int[][] grid2 = {
                {1},
                {0}
        };

        // Test case 2
        int result2 = solver.minFlips(grid2);
        System.out.println("Minimum flips for grid2: " + result2);

        // Add more test cases as needed
    }
    public int minFlips(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int flips = 0;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m / 2; j++) {
                int[] values = new int[4];
                values[0] = grid[i][j];
                values[1] = grid[i][m - j - 1];
                values[2] = grid[n - i - 1][j];
                values[3] = grid[n - i - 1][m - j - 1];

                int count0 = 0;
                int count1 = 0;
                for (int value : values) {
                    if (value == 0) count0++;
                    else count1++;
                }

                flips += Math.min(count0, count1);
            }
        }


        if (n % 2 == 1) {
            int i = n / 2;
            for (int j = 0; j < m / 2; j++) {
                if (grid[i][j] != grid[i][m - j - 1]) {
                    flips++;
                }
            }
        }

        if (m % 2 == 1) {
            int j = m / 2;
            for (int i = 0; i < n / 2; i++) {
                if (grid[i][j] != grid[n - i - 1][j]) {
                    flips++;
                }
            }
        }

        return flips;
    }
}
