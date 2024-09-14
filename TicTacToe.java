public class TicTacToe {

    static char[][] board;

    //initialize board
    TicTacToe(){
        board = new char[3][3];
    }

    //initialize the board with empty spaces.
    public void initBoard(){
        for (int i=0; i< board.length; i++){
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public static void displayBoard(){
        System.out.println("-------------");
        for (int i=0; i< board.length; i++){
            System.out.print("| ");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void placeMark(int row, int col, char mark){
        if (row >= 0 && row <=2 && col >= 0 && col <=2 ){
            board[row][col] = mark;
        } else{
            System.out.println("Invalid Input");
        }
    }

    public static boolean checkColumnWin(){
        // checks for column win
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
        }

        //checks for row win
    public static boolean checkRowWin(){
        for (int i = 0; i <=2; i++) {
            if (board[i][0] != ' ' && board[i][0]==board[i][1] && board[i][1] == board[i][2]){
                return true;
            }
        }
        return false;
    }

    //checks for diagonal win
    public static boolean checkDiagonalWin(){
        if ((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])){
            return true;
        }
        return false;
    }

    public static boolean checkDraw(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

}


