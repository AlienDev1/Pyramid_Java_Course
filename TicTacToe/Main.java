

import java.util.Scanner;

public class Main extends GamePlay {

    char user;
    boolean exit_code = false;
    boolean check = false;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        // Write to a File Printing the user name and high score!

        try{

            System.out.println("Welcome to Tic Tac Toe");
            main.clear_board();
            main.printBoard();
            // System.out.println("How many players 1 or 2");
            System.out.println("Enter your name >> ");
            main.setPlayer1(sc.nextLine());
            System.out.println("Hi "+ main.getPlayer1() + " Do you want to be X or O");
            main.setUser(sc.nextLine().toUpperCase().charAt(0));

            System.out.println(main.getPlayer1() + " the computer is going first.");

            if(main.getUser() == 'X'){
                main.setComputer_character('O');
            }else{
                main.setComputer_character('X');
            }

            main.setTurn(main.getComputer_character()); 

            int counter = 0;

            while (counter < 10){
                counter++;
                if(main.winner_checker()) { break; }

                if(main.getTurn() == main.computer_character){
                    main.update_board(main.computer_position, main.getComputer_character());
                    main.setTurn(main.getUser());

                }else if(main.getTurn() == main.getUser()){
                    System.out.println("What is your next move? (1-9)");
                    main.update_board(sc.nextInt() ,main.getUser());
                    main.setTurn(main.getComputer_character());
                }
                main.printBoard();
                System.out.println("\n");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Looks like something happened here in main Jibri ");
        }
    }
    
    public void printBoard(){
        char[][] updated = getGameBoard();
        System.out.println("|---|---|---|");
        System.out.println("| " + updated[0][0] + " | " + updated[0][1] + " | " + updated[0][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + updated[1][0] + " | " + updated[1][1] + " | " + updated[1][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + updated[2][0] + " | " + updated[2][1] + " | " + updated[2][2] + " |");
        System.out.println("|---|---|---|");
    }



}