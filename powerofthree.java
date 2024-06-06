public class powerofthree {
    public boolean isPowerOfThree(int n) {
        boolean ans = false;

        if(n<1){
            return false;
        }
        if(n== 1){
            return true;
        }
        while(n!=1){
            if(n%3!=0){
                ans = false;
                break;
            }else{
                ans = true;
            }
            n = n/3;
        }
        return ans;

    }
}
