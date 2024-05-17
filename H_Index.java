import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = {3,0,1,5,6};
        System.out.println("The H-Index is :"+hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;

    }


}
