
package com.company;

import java.util.Random;

public class Land {

    char[][] currentBoard = new char[7][7];
    final char player = 'C';
    final char goblin = 'G';
    final char empty_space = '~';
    Random rand = new Random();
    int x_axis = 0;
    int y_axis = 3;
    boolean event;


    // New Board Generator
    protected void create_new_board(){
        for(int row = 0; row < currentBoard.length; row++){
            for(int col = 0; col < currentBoard[row].length; col++){
                currentBoard[row][col] = empty_space;

                int setPiece = 1+rand.nextInt(49);
                if(setPiece % 4 == 0){
                    currentBoard[row][col] = goblin;
                }
            }
        }
        currentBoard[y_axis][x_axis] = player;
        setCurrentBoard(currentBoard);
    }

    // Update Board
    protected void update_board(int row, int col, int prev_row, int prev_col){
        char[][] update = getCurrentBoard();

        if(update[row][col] == empty_space){
            update[prev_row][prev_col] = empty_space;
            update[row][col] = player;
            setY_axis(row); setX_axis(col);
            setCurrentBoard(update);

        }else if( update[row][col] == goblin && update[row][col] != empty_space){
            setEvent(true);
            update[prev_row][prev_col] = empty_space;
            update[row][col] = player;
            setY_axis(row); setX_axis(col);
            setCurrentBoard(update);
        }
    }

    // Based received from userInput
    protected void move(char directions){
        switch (directions){
            case 'N':
                update_board(getY_axis()-1, getX_axis(), getY_axis(), getX_axis());
                break;
            case 'S':
                update_board(getY_axis()+1, getX_axis(), getY_axis(), getX_axis());
                break;
            case 'E':
                update_board(getY_axis(), getX_axis()+1, getY_axis(), getX_axis());
                break;
            case 'W':
                update_board(getY_axis(), getX_axis()-1, getY_axis(), getX_axis());
                break;
        }
    }

    //Getters & Setters
    protected void setCurrentBoard(char[][] currentBoard){
        this.currentBoard = currentBoard;
    }
    protected char[][] getCurrentBoard(){
        return currentBoard;
    }
    protected void setY_axis(int y_axis){this.y_axis = y_axis;}
    protected int getY_axis(){return y_axis;}
    protected void setX_axis(int x_axis){
        this.x_axis = x_axis;
    }
    protected int getX_axis(){
        return x_axis;
    }
    protected void setEvent(boolean event){
        this.event = event;
    }
    protected boolean getEvent(){return event;}

}
