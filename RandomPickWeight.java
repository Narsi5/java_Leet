import java.util.Random;
public class RandomPickWeight {
    Random rand = new Random();
    int[] w_sum;
    int sum = 0;

    public void Solution(int[] w) {
        w_sum = new int[w.length];

        for(int i = 0;i<w.length;i++){
            sum = sum + w[i];
            w_sum[i] = sum;
        }
    }

    public int pickIndex() {
        int r = rand.nextInt(sum) + 1;
        return bs(w_sum,0,w_sum.length -1 , r);
    }
    public int bs(int[] arr,int low,int high,int key){
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

}
