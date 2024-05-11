package Play;

public class Dooz {

    public static char[][] board;
    public char turnplayer;

    public Dooz() {
        board = new char[3][3];
        turnplayer = 'X';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the Board
    public static void screen() {
        System.out.print("***********\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
        // System.out.println();
        System.out.print("***********\n");
    }

    // Check valid place
    public boolean movement(int r, int c) {
        if ((r < 0 || r >= 3) || (c < 0 || c >= 3) || (board[r][c] != '-')) {
            return false;
        }
        board[r][c] = turnplayer;
        return true;
    }

    public boolean checkwinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == turnplayer && board[i][1] == turnplayer && board[i][2] == turnplayer) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == turnplayer && board[1][i] == turnplayer && board[2][i] == turnplayer) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == turnplayer && board[1][1] == turnplayer && board[2][2] == turnplayer)
                || (board[0][2] == turnplayer && board[1][1] == turnplayer && board[2][0] == turnplayer)) {
            return true;
        }
        return false;
    }
    public boolean fullborad() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public void changeplayer() {
        if(turnplayer == 'X')
            turnplayer = 'O';
        else
            turnplayer = 'X';
    }

}
