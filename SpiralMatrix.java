import java.util.List;
import java.util.ArrayList;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix == null || matrix.length == 0|| matrix[0].length == 0 ){
            return ans;
        }
        // first go right (till dead end)
        //after reaching dead end move down till deadend
        //move left to first
        //move one layer up and contiune towards right
        int right = matrix[0].length -1;
        int down = matrix .length -1;
        int left = 0;
        int top  = 0;
        while(top<=down && left <= right){
            //move right
            for(int i = left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //move down
            for(int i = top; i<=down ;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //move left
            if(top<= down){
                for(int i = right ;i>=left;i--){
                    ans.add(matrix[down][i]);
                }
                down--;
            }
            if(left<=right){
                for(int i = down;i>= top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
