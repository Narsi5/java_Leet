import java.util.ArrayList;
import java.util.Collections;

public class FindTheMininumAreaToCoverAllOnes {

        public int minimumArea(int[][] grid) {
            ArrayList<Integer> ilist = new ArrayList<>();
            ArrayList<Integer> jlist = new ArrayList<>();
            for(int i = 0;i<grid.length;i++){
                for(int j = 0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        ilist.add(i);
                        jlist.add(j);
                    }
                }
            }

            int mini = Collections.min(ilist);
            int minj = Collections.min(jlist);

            int maxi = Collections.max(ilist);
            int maxj = Collections.max(jlist);
            return ((maxi-mini+1)*(maxj-minj+1));
        }

}
