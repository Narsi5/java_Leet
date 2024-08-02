public class OnesAndZeros {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length +1][m+1][n+1];
        for(int i=1;i<=strs.length;i++){
            int zeros = findnoofzeros(strs[i-1]);
            int ones = strs[i-1].length() - zeros;

            for(int j = 0;j<=m;j++){
                for(int k = 0;k<=n;k++){
                    if( (j-zeros) >= 0 && (k-ones)>=0){
                        dp[i][j][k] = Math.max(1+dp[i-1][j-zeros][k-ones],dp[i-1][j][k]);
                    }else{
                        dp[i][j][k] = dp[i-1][j][k];
                    }
                }

            }

        }
        return dp[strs.length][m][n];

    }
    public int findnoofzeros(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                count++;
            }
        }
        return count;
    }
}
