package com.company;

import java.util.Scanner;

public class Main extends Human {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        boolean exit_code = false;
        main.create_new_board();
        do{
            main.print_board();
            System.out.println("\n");
            char userInput = sc.nextLine().toUpperCase().charAt(0);
            main.move(userInput);
            if(main.getEvent() == true){
                main.attack();
                System.out.println("You just battled a goblin your new health is : "+ main.getHuman_life());
                main.setEvent(false);
            }
        }while (exit_code = true);
    }

    public void print_board(){
        System.out.println("|---|---|---|---|---|---|---|");
        System.out.println("| " + currentBoard[0][0] + " | " + currentBoard[0][1] + " | " + currentBoard[0][2] + " | " + currentBoard[0][3] + " | " + currentBoard[0][4] + " | " + currentBoard[0][5] + " | " + currentBoard[0][6] + " |");
        System.out.println("|---------------------------|");
        System.out.println("| " + currentBoard[1][0] + " | " + currentBoard[1][1] + " | " + currentBoard[1][2] + " | " + currentBoard[1][3] + " | " + currentBoard[1][4] + " | " + currentBoard[1][5] + " | " + currentBoard[1][6] + " |");
        System.out.println("|---------------------------|");
        System.out.println("| " + currentBoard[2][0] + " | " + currentBoard[2][1] + " | " + currentBoard[2][2] + " | " + currentBoard[2][3] + " | " + currentBoard[2][4] + " | " + currentBoard[2][5] + " | " + currentBoard[2][6] + " |");
        System.out.println("|---------------------------|");
        System.out.println("| " + currentBoard[3][0] + " | " + currentBoard[3][1] + " | " + currentBoard[3][2] + " | " + currentBoard[3][3] + " | " + currentBoard[3][4] + " | " + currentBoard[3][5] + " | " + currentBoard[3][6] + " |");
        System.out.println("|---------------------------|");
        System.out.println("| " + currentBoard[4][0] + " | " + currentBoard[4][1] + " | " + currentBoard[4][2] + " | " + currentBoard[4][3] + " | " + currentBoard[4][4] + " | " + currentBoard[4][5] + " | " + currentBoard[4][6] + " |");
        System.out.println("|---------------------------|");
        System.out.println("| " + currentBoard[5][0] + " | " + currentBoard[5][1] + " | " + currentBoard[5][2] + " | " + currentBoard[5][3] + " | " + currentBoard[5][4] + " | " + currentBoard[5][5] + " | " + currentBoard[5][6] + " |");
        System.out.println("|---------------------------|");
        System.out.println("| " + currentBoard[6][0] + " | " + currentBoard[6][1] + " | " + currentBoard[6][2] + " | " + currentBoard[6][3] + " | " + currentBoard[6][4] + " | " + currentBoard[6][5] + " | " + currentBoard[6][6] + " |");
        System.out.println("|---|---|---|---|---|---|---|");
        System.out.println("|-------------N-------------|");
        System.out.println("|------W-------------E------|");
        System.out.println("|-------------S-------------|");
        System.out.println("Use the Keys Above to navigate within the game!");
    }
}

