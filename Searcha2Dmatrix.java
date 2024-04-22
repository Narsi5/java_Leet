//
//    #Intuition
//        <!-- Describe your first thoughts on how to solve this problem. -->
//1.Initial thought was to iterate through each element ,if element is there then return true else false
//2.As the have given in O(log(m*n)) had thought of a binarysearch
//    #Approach
//        <!-- Describe your approach to solving the problem. -->
//Approch 1:
//iterate through each element in the 2d array
//Approch 2:
//if element is present at mid return true
//else if check if target is less than if it is then search below it
//else check in the other half
//if the element is not found then return false
//    #Complexity
//-- Time complexity:
//Approch 1: its O(m*n) as its iterating through each element in the worst senario its found at last pos
//Approch 2: its O(log(m*n)

public class Searcha2Dmatrix {

    public static void main(String[] args) {

        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };

        System.out.println(searchMatrix(mat,3));
        System.out.println(searchMatrix(mat,8));
        System.out.println(searchMatrix(mat, 13));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
//Approch 1:
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(matrix[i][j]== target){
//                    return true;
//                }
//            }
//        }
//        return false;
        //Approch 2:

            int m=matrix.length,n=matrix[0].length;
            return search(matrix, 0, n-1, target);
    }
    public static boolean search(int[][] mat,int m,int n, int target){
        while ((m>=0 && m<mat.length)&&(n>=0 && n<mat[0].length)) {
            if(target== mat[m][n]){
                return true;
            }
            else if(target<mat[m][n]) {
                return search(mat, m, n-1, target);
            } else{
                return search(mat, m+1, n, target);
            }
        }
        return false;
    }

}
