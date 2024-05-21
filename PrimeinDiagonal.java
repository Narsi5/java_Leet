public class PrimeinDiagonal {
    public int diagonalPrime(int[][] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(isPrime(nums[i][i])){
                set.add(nums[i][i]);
            }
            if(isPrime(nums[i][nums.length -i-1])){
                set.add(nums[i][nums.length-i-1]);
            }
        }
        if(set.isEmpty()){
            return 0;
        }else{
            return Collections.max(set);
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i<=Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    } public int diagonalPrime(int[][] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(isPrime(nums[i][i])){
                set.add(nums[i][i]);
            }
            if(isPrime(nums[i][nums.length -i-1])){
                set.add(nums[i][nums.length-i-1]);
            }
        }
        if(set.isEmpty()){
            return 0;
        }else{
            return Collections.max(set);
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i<=Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
