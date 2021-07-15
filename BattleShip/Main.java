
import java.util.Scanner;

public class Main extends Board {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        main.newBoard();
        // boolean exit_code = false;

        // try{
        //    System.out.println("Battleship Multiplayer");
        //    System.out.println("Enter Player 1 name: ");
        //    String player1 = sc.nextLine();
        //    System.out.println("Enter player 2 name: ");
        //    String player2 = sc.nextLine();
        //    int counter = 0;

        //    System.out.println(player1 + ", please enter the coordinates for your ships.");
        
        



        //     main.setPlayer2Board(main.currentBoard);
        //     System.out.println("Confirm data to user 2");

        // }catch (Exception e){
        //     System.out.println("Something Happened Here in Main");
        //     continue start;
        // }
    }
    
    protected void print_board(){
        System.out.println("    1   2   3   4   5   6   7");
        System.out.println("  "+"|---|---|---|---|---|---|---|");
        System.out.println("1 "+"| " + currentBoard[0][0] + " | " + currentBoard[0][1] + " | " + currentBoard[0][2] + " | " + currentBoard[0][3] + " | " + currentBoard[0][4] + " | " + currentBoard[0][5] + " | " + currentBoard[0][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("2 "+"| " + currentBoard[1][0] + " | " + currentBoard[1][1] + " | " + currentBoard[1][2] + " | " + currentBoard[1][3] + " | " + currentBoard[1][4] + " | " + currentBoard[1][5] + " | " + currentBoard[1][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("3 "+"| " + currentBoard[2][0] + " | " + currentBoard[2][1] + " | " + currentBoard[2][2] + " | " + currentBoard[2][3] + " | " + currentBoard[2][4] + " | " + currentBoard[2][5] + " | " + currentBoard[2][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("4 "+"| " + currentBoard[3][0] + " | " + currentBoard[3][1] + " | " + currentBoard[3][2] + " | " + currentBoard[3][3] + " | " + currentBoard[3][4] + " | " + currentBoard[3][5] + " | " + currentBoard[3][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("5 "+"| " + currentBoard[4][0] + " | " + currentBoard[4][1] + " | " + currentBoard[4][2] + " | " + currentBoard[4][3] + " | " + currentBoard[4][4] + " | " + currentBoard[4][5] + " | " + currentBoard[4][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("6 "+"| " + currentBoard[5][0] + " | " + currentBoard[5][1] + " | " + currentBoard[5][2] + " | " + currentBoard[5][3] + " | " + currentBoard[5][4] + " | " + currentBoard[5][5] + " | " + currentBoard[5][6] + " |");
        System.out.println("  "+"|---------------------------|");
        System.out.println("7 "+"| " + currentBoard[6][0] + " | " + currentBoard[6][1] + " | " + currentBoard[6][2] + " | " + currentBoard[6][3] + " | " + currentBoard[6][4] + " | " + currentBoard[6][5] + " | " + currentBoard[6][6] + " |");
        System.out.println("  "+"|---|---|---|---|---|---|---|");

        System.out.println("Use the Keys Above to navigate within the game!");
    }

    protected void set_player_one_setUp(Scanner sc, Main main){
        char direction;
        System.out.println("Enter the coordinates for the carrier: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the carrier: y-axis");
        main.setY_axis(sc.nextInt()-1);
        System.out.println("Place horizontally or vertically (h or v)?");
        main.carrier();
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);
        main.setY_axis(0);
        main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the battleship: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the battleship: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.battleship();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);
        main.setY_axis(0);
        main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Submarine: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Submarine: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.submarine();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);
        main.setY_axis(0);
        main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Destroyer: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Destroyer: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.destroyer();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);
        main.setY_axis(0);
        main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Patrol Boat: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Patrol Boat: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.patrol_boat();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);

        // Resetting X and Y axis to default value per loop iteration
        main.setPlayer1Board(main.getCurrentBoard());
        main.newBoard();
        main.setX_axis(0);
        main.setY_axis(0);
    }

    protected static void set_player_two_setUp(Scanner sc, Main main){

        char direction;
        System.out.println("Enter the coordinates for the carrier: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the carrier: y-axis");
        main.setY_axis(sc.nextInt()-1);
        System.out.println("Place horizontally or vertically (h or v)?");
        main.carrier();
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);
        main.setY_axis(0);
        main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the battleship: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the battleship: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.battleship();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);
        main.setY_axis(0);
        main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Submarine: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Submarine: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.submarine();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);
        main.setY_axis(0);
        main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Destroyer: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Destroyer: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.destroyer();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);
        main.setY_axis(0);
        main.setX_axis(0);

        main.print_board();
        System.out.println("Enter the coordinates for the Patrol Boat: x-axis");
        main.setX_axis(sc.nextInt()-1);
        System.out.println("Enter the coordinates for the Patrol Boat: y-axis");
        main.setY_axis(sc.nextInt()-1);
        main.patrol_boat();
        System.out.println("Place horizontally or vertically (h or v)?");
        direction = sc.next().toUpperCase().charAt(0);
        main.placeShip(direction);

        // Resetting X and Y axis to default value per loop iteration
        main.setPlayer1Board(main.getCurrentBoard());
        main.newBoard();
        main.setX_axis(0);
        main.setY_axis(0);
    }
}


