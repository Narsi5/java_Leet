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
        while(j>=0 && s.charAt(j) != ' ')
            --j;
        return lastword-j;
    }
}
