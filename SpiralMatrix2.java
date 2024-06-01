public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int right = matrix[0].length -1;
        int down = matrix .length -1;
        int left = 0;
        int top  = 0;
        while(top<=down && left <= right){
            //move right
            for(int i = left;i<=right;i++){
                matrix[top][i] = count;
                count++;
            }
            top++;
            //move down
            for(int i = top; i<=down ;i++){
                matrix[i][right] = count;
                count ++;
            }
            right--;
            //move left
            if(top<= down){
                for(int i = right ;i>=left;i--){
                    matrix[down][i] = count;
                    count++;
                }
                down--;
            }
            if(left<=right){
                for(int i = down;i>= top;i--){
                    matrix[i][left] = count;
                    count++;
                }
                left++;
            }
        }


        return matrix;
    }
}
