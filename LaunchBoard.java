public class LaunchBoard {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        TicTacToe.displayBoard();
        t.initBoard();

        HumanPlayer p1 = new HumanPlayer("Bob",'X');
        HumanPlayer p2 = new HumanPlayer("Alexa",'O');

        HumanPlayer cp;
        cp = p1;
        while (true){
            System.out.println(cp.name+"'s turn");
            cp.markMove();
            TicTacToe.displayBoard();
            if (TicTacToe.checkColumnWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagonalWin()){
                System.out.println(cp.name+" won");
                break;
            } else if (TicTacToe.checkDraw()) {
                System.out.println("It's a Draw !!");
                break;
            } else{
                if (cp == p1){
                    cp = p2;
                } else{
                    cp = p1;
                }
            }
        }
    }
}
