import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, not anagrams
        }
        char arrayfors[] = s.toCharArray();
        Arrays.sort(arrayfors);
        char arrayfort[] = t.toCharArray();
        Arrays.sort(arrayfort);
        return Arrays.equals(arrayfors,arrayfort);
    }
}
