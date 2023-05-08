import java.util.ArrayList;

public class GameLogic {
    public GameLogic() {
    }

    public void printBoard(char[][] board) {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("--+---+--");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("--+---+--");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    public void switches(char[][] board, int point, int moves) {
        ArrayList[][] checkAvailable = new ArrayList[3][3];
        boolean is_X = moves % 2 == 1;
        if (is_X) {
            System.out.println("NOW O:");
        } else {
            System.out.println("NOW X:");
        }

        if (point >= 1 && point <= 9) {
            switch (point) {
                case 1:
                    if (board[0][0] != 'X' && board[0][0] != 'O') {
                        board[0][0] = (char)(is_X ? 88 : 79);
                        checkAvailable[0][0] = new ArrayList();
                        checkAvailable[0][0].add(board[0][0]);
                        break;
                    }

                    throw new RuntimeException();
                case 2:
                    if (board[0][1] == 'X' || board[0][1] == 'O') {
                        throw new RuntimeException();
                    }

                    board[0][1] = (char)(is_X ? 88 : 79);
                    checkAvailable[0][1] = new ArrayList();
                    checkAvailable[0][1].add(board[0][1]);
                    break;
                case 3:
                    if (board[0][2] == 'X' || board[0][2] == 'O') {
                        throw new RuntimeException();
                    }

                    board[0][2] = (char)(is_X ? 88 : 79);
                    checkAvailable[0][2] = new ArrayList();
                    checkAvailable[0][2].add(board[0][2]);
                    break;
                case 4:
                    if (board[1][0] == 'X' || board[1][0] == 'O') {
                        throw new RuntimeException();
                    }

                    board[1][0] = (char)(is_X ? 88 : 79);
                    checkAvailable[1][0] = new ArrayList();
                    checkAvailable[1][0].add(board[1][0]);
                    break;
                case 5:
                    if (board[1][1] == 'X' || board[1][1] == 'O') {
                        throw new RuntimeException();
                    }

                    board[1][1] = (char)(is_X ? 88 : 79);
                    checkAvailable[1][1] = new ArrayList();
                    checkAvailable[1][1].add(board[1][1]);
                    break;
                case 6:
                    if (board[1][2] != 'X' && board[1][2] != 'O') {
                        board[1][2] = (char)(is_X ? 88 : 79);
                        checkAvailable[1][2] = new ArrayList();
                        checkAvailable[1][2].add(board[1][2]);
                        break;
                    }

                    throw new RuntimeException();
                case 7:
                    if (board[2][0] == 'X' || board[2][0] == 'O') {
                        throw new RuntimeException();
                    }

                    board[2][0] = (char)(is_X ? 88 : 79);
                    checkAvailable[2][0] = new ArrayList();
                    checkAvailable[2][0].add(board[2][0]);
                    break;
                case 8:
                    if (board[2][1] != 'X' && board[2][1] != 'O') {
                        board[2][1] = (char)(is_X ? 88 : 79);
                        checkAvailable[2][1] = new ArrayList();
                        checkAvailable[2][1].add(board[2][1]);
                        break;
                    }

                    throw new RuntimeException();
                case 9:
                    if (board[2][2] == 'X' || board[2][2] == 'O') {
                        throw new RuntimeException();
                    }

                    board[2][2] = (char)(is_X ? 88 : 79);
                    checkAvailable[2][2] = new ArrayList();
                    checkAvailable[2][2].add(board[2][2]);
            }
        } else {
            System.out.println("Choose any number between (1-9)!");
        }

    }

    public boolean win(char[][] board) {
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board.length; ++j) {
                if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
                        || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
                        || (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
                        || (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
                        || (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
                        || (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
                        || (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
                        || (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) {
                    System.out.println("WINNER IS X");
                    return true;
                }
                if ((board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
                        || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
                        || (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
                        || (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
                        || (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
                        || (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
                        || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
                        || (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {
                    System.out.println("WINNER IS O");
                    return true;
                }
            }
        }

        return false;
    }
}
