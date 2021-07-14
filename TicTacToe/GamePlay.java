package com.company;

public class GamePlay {
    char[][] gameBoard = new char[3][3];
    char turn;
    char computer_character;
    int computer_position = (int) Math.random()* (1 - 9+1) + 1;
    char user;

    protected void update_board(int selection, char turn){
        char[][] update = getGameBoard();
        switch (selection){
            case 1:
                if(Character.isDigit(update[0][0])){
                    update[0][0] = turn;
                    setGameBoard(update);
                    break;
                }
            case 2:
                if(Character.isDigit(update[0][1])){
                    update[0][1] = turn;
                    setGameBoard(update);
                    break;
                }

            case 3:
                if(Character.isDigit(update[0][2])){
                    update[0][2] = turn;
                    setGameBoard(update);
                    break;
                }
            case 4:
                if(Character.isDigit(update[1][0])){
                    update[1][0] = turn;
                    setGameBoard(update);
                    break;
                }
            case 5:
                if(Character.isDigit(update[1][1])){
                    update[1][1] = turn;
                    setGameBoard(update);
                    break;
                }

            case 6:
                if(Character.isDigit(update[1][2])){
                    update[1][2] = turn;
                    setGameBoard(update);
                    break;
                }
            case 7:
                if(Character.isDigit(update[2][0])){
                    update[2][0] = turn;
                    setGameBoard(update);
                    break;
                }
            case 8:
                if(Character.isDigit(update[2][1])){
                    update[2][1] = turn;
                    setGameBoard(update);
                    break;
                }
            case 9:
                if(Character.isDigit(update[2][2])){
                    update[2][2] = turn;
                    setGameBoard(update);
                    break;
                }
        }
    }


    protected void clear_board(){
        char [][] newBoard = getGameBoard();
        for(int row = 0; row < newBoard.length; row++){
            for(int col = 0; col < newBoard[row].length; col++){

                newBoard[row][col] = '1';
            }
        }
        setGameBoard(newBoard);
    }

    protected boolean winner_checker(){
        char[][] check = getGameBoard();
        if( check[0][0] == user && check[1][0] == user && check[2][0] == user ||  check[0][0] == computer_character && check[1][0] == computer_character && check[2][0] == computer_character){
            System.out.println("Winner is :" + getTurn());
            return true;
        }else if(check[0][1] == getUser() && check[1][1] == getUser() && check[2][1] == getUser() || check[0][1] == getComputer_character() && check[1][1] == getComputer_character() && check[2][1] == getComputer_character()){
            System.out.println("Winner is :" + getTurn());
            return true;
        }else if(check[0][2] == getUser() && check[1][2] == getUser() && check[2][2] == getUser() || check[0][2] == getComputer_character() && check[1][2] == getComputer_character() && check[2][2] == getComputer_character()){
            System.out.println("Winner is :" + getTurn());
            return true;
        }else if(check[0][0] == getUser() && check[0][1] == getUser() && check[0][2] == getUser() || check[0][0] == getComputer_character() && check[0][1] == getComputer_character() && check[0][2] == getComputer_character()){
            System.out.println("Winner is :" + getTurn());
            return true;
        }else if(check[1][0] == getUser() && check[1][1] == getUser() && check[1][2] == getUser() || check[1][0] == getComputer_character() && check[1][1] == getComputer_character() && check[1][2] == getComputer_character()){
            System.out.println("Winner is :" + getTurn());
            return true;
        }else if(check[2][0] == getUser() && check[2][1] == getUser() && check[2][2] == getUser() || check[2][0] == getComputer_character() && check[2][1] == getComputer_character() && check[2][2] == getComputer_character()){
            System.out.println("Winner is :" + getTurn());
            return true;
        }else if( check[2][0] == getUser() && check[1][1] == getUser() && check[0][2] == getUser() ||  check[2][0] == getComputer_character() && check[1][1] == getComputer_character() && check[0][2] == getComputer_character()){
            System.out.println("Winner is :" + getTurn());
            return true;
        }else if( check[2][2] == getUser() && check[1][1] == getUser() && check[0][0] == getUser() ||  check[2][2] == getComputer_character() && check[1][1] == getComputer_character() && check[0][0] == getComputer_character()){
            System.out.println("Winner is :" + getTurn());
            return true;
        }else
            return false;
    }


    protected char[][] getGameBoard() {
        return gameBoard;
    }
    protected void setGameBoard(char[][] gameBoard) {
        this.gameBoard = gameBoard;
    }
    protected void setTurn(char turn){
        this.turn = turn;
    }
    protected char getTurn(){return turn;}
    protected void setComputer_character(char computer_character){
        this.computer_character = computer_character;
    }
    protected char getComputer_character(){
        return computer_character;
    }
    protected void setUser(char user){this.user = user;}
    protected char getUser(){return user;}
}