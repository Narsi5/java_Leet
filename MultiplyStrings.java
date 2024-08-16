public class MultiplyStrings {
       public String multiply(String num1, String num2) {
            int n = num1.length();
            int m = num2.length();

            int[] arr = new int[n+m];
            for(int i = n -1;i>=0;i--){
                int num = num1.charAt(i)-'0';
                for(int j = m -1;j>=0;j--){
                    int digit = num2.charAt(j)-'0';
                    int product = digit * num ;
                    int p1= i+j;
                    int p2 = i+j+1;
                    int sum = product+arr[p2];
                    arr[p2] =(sum %10);
                    arr[p1] += sum/10;
                }
            }

            StringBuilder ans = new StringBuilder();
            for(int num : arr){
                if(!(ans.length()  == 0 && num == 0)){
                    ans.append(num);
                }
            }
            return ans.length() == 0 ? "0":ans.toString();
        }

}
