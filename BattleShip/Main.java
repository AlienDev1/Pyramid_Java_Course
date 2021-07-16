
import java.util.Scanner;

public class Main extends Board {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        main.newBoard(true); // Resets the game!
        // boolean exit_code = false;

        // try{
        //    System.out.println("Battleship Multiplayer");
        //    System.out.println("Enter Player 1 name: ");
        //    String player1 = sc.nextLine();
        //    System.out.println("Enter player 2 name: ");
        //    String player2 = sc.nextLine();
        //    System.out.println(player1 + ", please enter the coordinates for your ships to be placed");
        
        player_one_setUp(sc, main);
        player_two_setUp(sc, main);
        
        // Test
        main.setCurrentBoard(main.getPlayer1Board());
        main.print_board(); 
        System.out.println("This is player 1 board ^");
        
        
        main.setCurrentBoard(main.getPlayer2Board());
        main.print_board();
        System.out.println("This is player 2 board ^");


        //     main.setPlayer2Board(main.currentBoard);
        //     System.out.println("Confirm data to user 2");

        // }catch (Exception e){
        //     System.out.println("Something Happened Here in Main");
        //     continue start;
        // }
    }
    

    protected void print_board(){

        char[][] workingBoard = getCurrentBoard();

        System.out.println("    1   2   3   4   5   6   7");
        System.out.println("  "+"|---|---|---|---|---|---|---|");
        System.out.println("1 "+"| " + workingBoard[0][0] + " | " + workingBoard[0][1] + " | " + workingBoard[0][2] + " | " + workingBoard[0][3] + " | " + workingBoard[0][4] + " | " + workingBoard[0][5] + " | " + workingBoard[0][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("2 "+"| " + workingBoard[1][0] + " | " + workingBoard[1][1] + " | " + workingBoard[1][2] + " | " + workingBoard[1][3] + " | " + workingBoard[1][4] + " | " + workingBoard[1][5] + " | " + workingBoard[1][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("3 "+"| " + workingBoard[2][0] + " | " + workingBoard[2][1] + " | " + workingBoard[2][2] + " | " + workingBoard[2][3] + " | " + workingBoard[2][4] + " | " + workingBoard[2][5] + " | " + workingBoard[2][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("4 "+"| " + workingBoard[3][0] + " | " + workingBoard[3][1] + " | " + workingBoard[3][2] + " | " + workingBoard[3][3] + " | " + workingBoard[3][4] + " | " + workingBoard[3][5] + " | " + workingBoard[3][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("5 "+"| " + workingBoard[4][0] + " | " + workingBoard[4][1] + " | " + workingBoard[4][2] + " | " + workingBoard[4][3] + " | " + workingBoard[4][4] + " | " + workingBoard[4][5] + " | " + workingBoard[4][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("6 "+"| " + workingBoard[5][0] + " | " + workingBoard[5][1] + " | " + workingBoard[5][2] + " | " + workingBoard[5][3] + " | " + workingBoard[5][4] + " | " + workingBoard[5][5] + " | " + workingBoard[5][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("7 "+"| " + workingBoard[6][0] + " | " + workingBoard[6][1] + " | " + workingBoard[6][2] + " | " + workingBoard[6][3] + " | " + workingBoard[6][4] + " | " + workingBoard[6][5] + " | " + workingBoard[6][6] + " |");
        System.out.println("  "+"|---|---|---|---|---|---|---|");
    }

    // Experiemtn on Player1 
    protected static void player_one_setUp(Scanner sc, Main main){
        
        char direction;
        byte player = 1;
        
        System.out.println("Player 1");
        main.print_board();
        System.out.println("Enter the coordinates for the carrier: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the carrier: y-axis");
        main.setY_axis(sc.nextInt()-1);
        System.out.println("Place horizontally or vertically (h or v)?");
        main.carrier();
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);
        // main.setY_axis(0);
        // main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the battleship: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the battleship: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.battleship();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);
        // main.setY_axis(0);
        // main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Submarine: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Submarine: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.submarine();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);
        // main.setY_axis(0);
        // main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Destroyer: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Destroyer: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.destroyer();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);
        // main.setY_axis(0);
        // main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Patrol Boat: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Patrol Boat: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.patrol_boat();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);


        // Setting updated ship placments to player 1 board
        main.setPlayer1Board(main.getCurrentBoard());

        // Resetting X and Y axis to default value per loop iteration
        
        // main.newBoard(false);
        // main.setX_axis(0);
        // main.setY_axis(0);
    }

    protected static void player_two_setUp(Scanner sc, Main main){

        // Clears the Current Working board
        main.newBoard(false);

        //Done Also commented out code that resets x and y to 0
        char direction;
        byte player = 2;

        System.out.println("Player 2 !!");
        main.print_board();
        System.out.println("Enter the coordinates for the carrier: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the carrier: y-axis");
        main.setY_axis(sc.nextInt()-1);
        System.out.println("Place horizontally or vertically (h or v)?");
        main.carrier();
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);
        // main.setY_axis(0);
        // main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the battleship: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the battleship: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.battleship();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);
        // main.setY_axis(0);
        // main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Submarine: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Submarine: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.submarine();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);
        // main.setY_axis(0);
        // main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Destroyer: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Destroyer: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.destroyer();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);
        // main.setY_axis(0);
        // main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Patrol Boat: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Patrol Boat: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.patrol_boat();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction, player);


        // main.setPlayer1Board(main.getCurrentBoard());      
        // main.newBoard();
        // main.setX_axis(0);
        // main.setY_axis(0);
    }
}


