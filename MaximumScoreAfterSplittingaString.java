public class MaximumScoreAfterSplittingaString {
    public int maxScore(String s) {
        int max = 0;
        int lcount =0;
        int rcount= 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) =='1') rcount++;
        }

        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i) == '0'){
                lcount++;
            }else{
                rcount--;
            }
            max = Math.max(max,lcount+rcount);
        }
        return max;
    }
}
