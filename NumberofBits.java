public class NumberofBits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        int ans = 0;

        for (int i = 0; i < 32; ++i)
            if (((n >> i) & 1) == 1)
                ++ans;

        return ans;
    }


}
