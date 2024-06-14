public class WaterandJugproblem {
    public boolean canMeasureWater(int x, int y, int target) {
        if((x+y)<target) return false;
        int gcd = findgcd(x,y);
        if(target%gcd == 0){
            return true;
        }else{
            return false;
        }
    }
    public int findgcd(int x,int y){
        if(y==0){
            return x;
        }
        return findgcd(y,x%y);

    }
}
