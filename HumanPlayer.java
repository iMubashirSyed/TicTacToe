import java.util.Scanner;

public class HumanPlayer {
    String name;
    char mark;

    HumanPlayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }

    public void markMove(){
        Scanner inp = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("Enter row and col for placing a mark.");
            row = inp.nextInt();
            col = inp.nextInt();
        } while (!isValidMove(row,col));
        TicTacToe.placeMark(row,col,mark);
    }

    public boolean isValidMove(int row, int col){
        if (row >= 0 && row <=2 && col >=0 && col <= 2){
            if (TicTacToe.board[row][col] == ' '){
                return true;
            }
        }
    return false;
    }
}
