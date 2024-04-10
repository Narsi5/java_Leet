import java.util.Scanner;

public class SudokuSolver {
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col, int number) {
        //row & column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        //grid
        int sr = 3*(row / 3) ;
        int sc = 3 *(col / 3);
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }

            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public static void solveSudoko(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the board which are fixed (use '.' for empty cells)");

        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            String row = sc.next();
            for (int j = 0; j < 9; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        solveSudoko(board);
        printBoard(board);

    }
}
