public class Poweroftwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
//    public boolean isPowerOfTwo(int n) {
//        if(n<=0){
//            return false;
//        }
//        if((Math.log(n)/Math.log(2))%1 == 0){
//            return true;
//        } else{
//            return false;
//        }
//
//    }
}
