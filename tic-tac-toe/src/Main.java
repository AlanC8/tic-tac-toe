import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        int moves = 10;
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        boolean active = true;
        while (moves != 0 && active) {
            gameLogic.printBoard(board);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a cell to start in coord WITH O: (1-9)");
            int userPrint = scanner.nextInt();
            gameLogic.switches(board, userPrint, moves);
            if (gameLogic.win(board) == true) {
                active = false;
            }
            if(moves == 0){
                System.out.println("DRAW");
            }
            moves--;
        }
        System.out.println("GAME HAS BEEN ENDED!");
    }
}