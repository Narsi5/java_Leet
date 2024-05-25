public class findthefirstoccurence {
    public int strStr(String haystack, String needle) {
        int flag=1;

        for(int i=0;i<haystack.length() - needle.length() +1;i++){
            flag=1;
            for(int j=0;j<needle.length();j++){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                return i;
            }
        }
        return -1;

    }
}
