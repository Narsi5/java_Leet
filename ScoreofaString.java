public class ScoreofaString {

    public int scoreOfString(String s) {
        int ans =0;
        for(int i=0;i<s.length()-1;i++){
            int s1 = (s.charAt(i) -'0');
            int s2 = (s.charAt(i+1) -'0');
            ans += Math.abs(s1-s2);
        }
        return ans;
    }
}
