import java.util.*;
public class CountVowelStringsinRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] prefixsum = new int[words.length+1];
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int k =0;
        for(String word : words){
            char start = word.charAt(0);
            char end = word.charAt(word.length()-1);
            prefixsum[k+1] = prefixsum[k] + ((set.contains(start) && set.contains(end))?1:0);
            k++;
        }
        for(int i =0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            ans[i] = prefixsum[r+1] - prefixsum[l];

        }
        return ans;
    }
}
