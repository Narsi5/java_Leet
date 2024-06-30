public class LexicographicallySmallestStringAfteraSwap {
    public String getSmallestString(String s) {
        char[] chars = s.toCharArray();

        boolean swapped = false;

        for (int i = 0; i < chars.length - 1; i++) {
            if ((chars[i] % 2) == (chars[i + 1] % 2)) {
                if (chars[i] > chars[i + 1] && !swapped) {
                    char temp = chars[i];
                    chars[i] = chars[i + 1];
                    chars[i + 1] = temp;

                    swapped = true;
                }
            }
        }

        return new String(chars);
    }
}
