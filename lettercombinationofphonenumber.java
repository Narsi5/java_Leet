import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lettercombinationofphonenumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);
            List<String> temp = new ArrayList<>();
            String letters = map.get(digit);
            for (int j = 0; j < result.size(); j++) {
                String combination = result.get(j);
                for (int k = 0; k < letters.length(); k++) {
                    temp.add(combination + letters.charAt(k));
                }
            }
            result = temp;
        }

        return result;
    }
}
