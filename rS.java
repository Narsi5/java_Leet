public class rS {
    public static void printreverse(char[] s){
        int n = s.length;
        for(int i = 0;i<n/2;i++){
            char temp = s[i];
            s[i]=s[n-1-i];
            s[n-1-i] = temp;
        }
        for(int i = 0;i<n;i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void main(String[] args) {
        char[] arr ={'a','b','c'};
        printreverse(arr);

    }
}
