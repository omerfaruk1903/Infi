package at.öfk.basis;
import java.util.Scanner;
public class TicTacToe {
    private static final char[][] board = new char[3][3];
    private static final Scanner scanner = new Scanner(System.in);
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        boolean isGameOver = false;

        while (!isGameOver) {
            System.out.println("Current player: " + currentPlayer);
            int row, col;
            do {
                System.out.println("Gib eine Zahl an. 0, 1 oder 2. Die erste Nummer ist für die waagrechten Spalten");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ');

            board[row][col] = currentPlayer;
            printBoard();

            if (checkForWin()) {
                System.out.println("Player " + currentPlayer + " gets an Epicc Win!");
                isGameOver = true;
            } else if (isBoardFull()) {
                System.out.println("It's a draw, you both are trash!");
                isGameOver = true;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }

    private static boolean checkForWin() {
        // Achte auf Zeilen, Spalten und Diagonale für einen Epischennnn Win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}