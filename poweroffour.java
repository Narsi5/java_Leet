public class poweroffour {
    class Solution {
        public boolean isPowerOfFour(int n) {
            boolean ans = false;

            if(n<1){
                return false;
            }
            if(n== 1){
                return true;
            }
            while(n!=1){
                if(n%4!=0){
                    ans = false;
                    break;
                }else{
                    ans = true;
                }
                n = n/4;
            }
            return ans;


        }
    }
}
