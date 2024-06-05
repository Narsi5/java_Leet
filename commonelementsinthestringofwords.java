import java.util.ArrayList;
import java.util.List;

public class commonelementsinthestringofwords {
    public List<String> commonChars(String[] words) {
        ArrayList<Character> ans = new ArrayList<>();
        for (char c : words[0].toCharArray()) {
            ans.add(c);
        }

        for (int i = 1; i < words.length; i++) {
            ArrayList<Character> temp = new ArrayList<>();
            for (char c : words[i].toCharArray()) {
                if (ans.contains(c)) {
                    temp.add(c);
                    ans.remove(Character.valueOf(c));
                }
            }
            ans = temp;
        }

        //char to string
        List<String> result = new ArrayList<>();
        for (Character c : ans) {
            result.add(String.valueOf(c));
        }

        return result;

    }
}
