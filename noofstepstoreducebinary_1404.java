public class noofstepstoreducebinary_1404 {
    public int numSteps(String s) {
        int count = 0;
        int carry = 0;
        for(int i = s.length()-1;i>=1;i--){
            int rightbit = s.charAt(i) -'0';
            if((rightbit+carry) == 1){
                carry= 1;
                count += 2;
            }else{
                count++;
            }
        }
        return count+carry;
    }
}
