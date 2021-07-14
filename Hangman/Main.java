package com.company;

import java.util.ArrayList;

// Hangman Main Class
public class Main{

    public static String title = "H A N G M A N";
    public static String bottem = "Secret Pass Code";


    // Main Method
    public static void main(String [] args){

        // Variable and Constructors
        Logic logic = new Logic();
        Main main = new Main();
        int state = 0;
        String n = "null";
        ArrayList <Character> list = new ArrayList<Character>();
        main.board_state(state);

        String passphrase = logic.getSecret_word();

        if(n.equalsIgnoreCase(passphrase)){
            logic.getSecret_word();

        }else{
            do{
                System.out.print("\nEnter your letter >> ");
                char ans = logic.sc.next().charAt(0);
                if(logic.check(passphrase,ans) != 0){
                    state++;
                    main.board_state(state);
                }
            }while(state == 0);
        }
    }

    //GUI Board
    public void board_state(int board_update){
        switch (board_update){
            case 1:
                System.out.printf(
                        "\n              "+
                                "\n"+title +
                                "                "+
                                "\n +-----------+"+
                                "\n              "+
                                "\n 0           |"+
                                "\n              "+
                                "\n             |"+
                                "\n              "+
                                "\n             |"+
                                "\n              "+
                                "\n        ======"+
                                "\n              "+
                                "\n"+bottem       +
                                "\n         _ _ _"+
                                "\n               ");
                break;
            case 2:
                System.out.printf(
                        "\n              "+
                                "\n"+title +
                                "                "+
                                "\n +-----------+"+
                                "\n              "+
                                "\n 0           |"+
                                "\n              "+
                                "\n |           |"+
                                "\n              "+
                                "\n             |"+
                                "\n              "+
                                "\n        ======"+
                                "\n              "+
                                "\n"+bottem+
                                "\n         _ _ _");
                break;
            case 3:
                System.out.printf(
                        "\n              "+
                                "\n"+title +
                                "                "+
                                "\n +-----------+"+
                                "\n              "+
                                "\n 0           |"+
                                "\n              "+
                                "\n |           |"+
                                "\n              "+
                                "\n |           |"+
                                "\n              "+
                                "\n        ======"+
                                "\n              "+
                                "\n"+bottem+
                                "\n         _ _ _");
                break;
            default:
                System.out.printf(
                        "\n              "+
                                "\n"+title +
                                "                "+
                                "\n +-----------+"+
                                "\n              "+
                                "\n             |"+
                                "\n              "+
                                "\n             |"+
                                "\n              "+
                                "\n             |"+
                                "\n              "+
                                "\n        ======"+
                                "\n              "+
                                "\n        "+bottem+
                                "\n         _ _ _");
        }
    }
}