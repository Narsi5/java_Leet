public class CheckifitsXmatrix {
    public static void main(String[] args) {
        int[][] grid = {{0,0,0,0,1},{0,4,0,1,0},{0,0,5,0,0},{0,5,0,2,0},{4,0,0,0,2}};
        System.out.println(checkXMatrix(grid));
    }
    public static boolean checkXMatrix(int[][] grid) {
        boolean ans  = true;


        for (int i = 0; i < grid.length; i++) {
            if(grid[i][i]==0 || grid[i][grid.length-1-i] ==0){
                return  false;
            }
            for (int j = 0; j <grid[i].length; j++) {
                if( i != j && j!= grid[i].length -i-1) {
                    if (grid[i][j] == 0) {
                        ans = true;
                    }
                    else {
                        return false;
                    }
                }



            }
        }
        return ans;
    }
}
