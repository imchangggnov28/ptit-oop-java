import java.util.Scanner;
import java.util.Arrays;
public class Bai11 {
    private static final char EMPTY = '-';
    private static final char BOARD_SIZE = 3;

    public static void printBoard(char[][] board) {
        System.out.println("  0 1 2");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) return false;
        return board[row][col] == EMPTY;
    }

    public static boolean isFull(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char[][] board, char player) {
        // Kiểm tra hàng và cột
        for (int i = 0; i < BOARD_SIZE; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        // Kiểm tra 2 đường chéo
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            Arrays.fill(board[i], EMPTY);
        }

        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameOver = false;

        System.out.println("TRÒ CHƠI TIC-TAC-TOE");

        while (!gameOver) {
            printBoard(board);
            System.out.println("Lượt của người chơi " + currentPlayer);
            System.out.print("Nhập hàng và cột (0-2), ví dụ: 1 2: ");
            
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!isValidMove(board, row, col)) {
                System.out.println("Nước đi không hợp lệ! Vui lòng thử lại.\n");
                continue;
            }

            board[row][col] = currentPlayer;

            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Chúc mừng! Người chơi " + currentPlayer + " ĐÃ THẮNG!");
                gameOver = true;
            } else if (isFull(board)) {
                printBoard(board);
                System.out.println("HÒA! Bàn cờ đã đầy.");
                gameOver = true;
            } else {
                // Đổi lượt
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }
}