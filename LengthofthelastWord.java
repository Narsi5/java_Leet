public class LengthofthelastWord {
    public static void main(String[] args) {
        String input = " hello world oh ";
        System.out.println(LastWord(input));
    }
    public static int LastWord(String s) {
        int lastword = s.length() -1;//give the total length of the string 
        while(lastword>=0 && s.charAt(lastword)==' ')//if the lastcharacter is space then it decreases the length of the string 
            --lastword;//it repeats untill the last char is not zero
        int j=lastword;
        while(j>=0 && s.charAt(j) != ' ')//it checks untill it finds the next space ,as till that it will be one word
            --j;
        return lastword-j;//it gives the length of the word as it subracts totallength of string igonring the last space and when found the next space so that it returns total
    }
}
