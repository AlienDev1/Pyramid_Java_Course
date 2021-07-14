package com.company;

public class Board extends Controller{

    char [][] currentBoard = new char[8][8];
    char [][] player1Board = new char[8][8];
    char [][] player2Board = new char[8][8];
    int x_axis = 0;
    int y_axis = 0;

    // Clear Board
    protected void newBoard() {
        char[][] update = getCurrentBoard();
        for(int row = 0; row < currentBoard.length -1; row++){
            for(int col = 0; col < currentBoard[row].length -1; col++){
                update[row][col] = '~';
            }
        }
        setCurrentBoard(update);
        setPlayer1Board(update);
        setPlayer2Board(update);
    }

    protected void placeShip(char direction) {
        char[][] update = getCurrentBoard();
        switch (direction){
            case 'H':
                for(int col = getX_axis(); col < getShipSize(); col++){
                        update[getY_axis()][col] = getShipType();
                }
                setCurrentBoard(update);
                break;

            case 'V':
                for(int row = getY_axis(); row < getShipSize(); row++){
                        update[row][getX_axis()] = getShipType();
                }
                setCurrentBoard(update);
                break;
        }
    }


    //Getters and Setters
    public void setCurrentBoard(char[][] currentBoard){
        this.currentBoard = currentBoard;
    }
    public char[][] getCurrentBoard(){
        return currentBoard;
    }
    public char[][] getPlayer1Board() {
        return player1Board;
    }
    public void setPlayer1Board(char[][] player1Board) {
        this.player1Board = player1Board;
    }
    public char[][] getPlayer2Board() {
        return player2Board;
    }
    public void setPlayer2Board(char[][] player2Board) {
        this.player2Board = player2Board;
    }
    public int getX_axis() {
        return x_axis;
    }
    public void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }
    public int getY_axis() {
        return y_axis;
    }
    public void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }
}
