public class UglyNumber2 {
        public int nthUglyNumber(int n) {
            int[] uglyno = new int[n];
            uglyno[0] = 1;
            int i = 0;
            int j =0;
            int k = 0;
            int mi = 2;
            int mj = 3;
            int mk = 5;

            for(int r = 1;r<n;r++){
                int nn = Math.min(mi,(Math.min(mj,mk)));
                uglyno[r] = nn;
                if(nn == mi){
                    i++;
                    mi = uglyno[i]*2;
                }
                if(nn == mj){
                    j++;
                    mj = uglyno[j]*3;
                }
                if(nn == mk){
                    k++;
                    mk = uglyno[k]*5;
                }
            }
            return uglyno[n-1];
        }


}
