public class ThreeConsecutiveOdd {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i= 0;i<arr.length-2;i++){
            if((arr[i]%2)!=0){
                if((arr[i+1]%2)!=0){
                    if((arr[i+2]%2)!=0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
