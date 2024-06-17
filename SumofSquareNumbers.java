public class SumofSquareNumbers {

    public boolean judgeSquareSum(int c) {
        for(int i = 2;i*i<= c;i++){
            if(c%i == 0){
                int power = 0;
                while(c%i == 0){
                    power++;
                    c = c/i;
                }
                if(i%4 == 3 && power%2 != 0){
                    return false;
                }
            }
        }
        return c%4 != 3;
    }
}
