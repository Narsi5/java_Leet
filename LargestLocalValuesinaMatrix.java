public class LargestLocalValuesinaMatrix {
    public int[][] largestLocal(int[][] grid) {
        int[][] maxlocal = new int[grid.length-2][grid[0].length-2];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                maxlocal[i][j] = maxElement(grid, i, j);
            }
        }
        return maxlocal;
    }
    public int maxElement(int[][] grid,int row,int col){
        int max = Integer.MIN_VALUE;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}
