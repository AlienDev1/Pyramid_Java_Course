
public class Board extends Controller{

    char [][] currentBoard = new char[8][8];
    char [][] player1Board = new char[8][8];
    char [][] player2Board = new char[8][8];
    int x_axis = 0;
    int y_axis = 0;

    // Clear Board
    protected void newBoard() {
        char[][] update = getCurrentBoard();

        // Resets All Boards Within the Game
        if(restart_game == true){
            char[][] update = getCurrentBoard();
            for(int row = 0; row < currentBoard.length -1; row++){
                for(int col = 0; col < currentBoard[row].length -1; col++){
                    update[row][col] = '~';
                }
            }
            setCurrentBoard(update);
            setPlayer1Board(update);
            setPlayer2Board(update);
        }else
            // Only resets the Current Working board
            for(int row = 0; row < currentBoard.length -1; row++){
                for(int col = 0; col < currentBoard[row].length -1; col++){
                    update[row][col] = '~';
                }
            }
            setCurrentBoard(update);
    }

    protected void placeShip(char direction, byte player) {

        // If player == 1 add to Player 1 Board OR if player == 2 add to player 2 Board
        char[][] update = getCurrentBoard();
        switch (direction){
            case 'H':
                for(int col = getX_axis(); col < getShipSize(); col++){
                    update[getY_axis()][col] = getShipType();
                }
                switch(player){
                    case 1:
                        setPlayer1Board(player1Board);
                        break;

                    case 2:
                        setPlayer2Board(player2Board);
                        break;    
                }
                break;

            case 'V':
                for(int row = getY_axis(); row < getShipSize(); row++){
                        update[row][getX_axis()] = getShipType();
                }
                switch(player){
                    case 1:
                        setPlayer1Board(player1Board);
                        break;

                    case 2:
                        setPlayer2Board(player2Board);
                        break;    
                }
        }
    }


    //Getters and Setters
    protected void setCurrentBoard(char[][] currentBoard){
        this.currentBoard = currentBoard;
    }
    protected char[][] getCurrentBoard(){
        return currentBoard;
    }
    protected char[][] getPlayer1Board() {
        return player1Board;
    }
    protected void setPlayer1Board(char[][] player1Board) {
        this.player1Board = player1Board;
    }
    protected char[][] getPlayer2Board() {
        return player2Board;
    }
    protected void setPlayer2Board(char[][] player2Board) {
        this.player2Board = player2Board;
    }
    protected int getX_axis() {
        return x_axis;
    }
    protected void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }
    protected int getY_axis() {
        return y_axis;
    }
    protected void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }
}
