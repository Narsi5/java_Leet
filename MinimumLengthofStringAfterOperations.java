public class MinimumLengthofStringAfterOperations {
    public int minimumLength(String s) {
        int n = s.length();
        int[] charmap = new int[26];

        for (char ch : s.toCharArray()) {
            charmap[ch - 'a']++;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (charmap[i] < 3) continue;
            if (charmap[i] % 2 != 0) {
                count += charmap[i] - 1;
            } else {
                count += charmap[i] - 2;
            }
        }

        return n - count;
    }
}
