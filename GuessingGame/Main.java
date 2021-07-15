

import java.util.Random;
import java.util.Scanner;

public class Main {

    private int numToGuess;

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        main.setNumToGuess(1+random.nextInt(20));
        int num = 0;

        while(num <= 6){

            num++;
            System.out.println("I am thinking of a number between (1-20) can you guess it?");
            int userInput = sc.nextInt();

            if(main.getNumToGuess() == userInput){
                System.out.println("Congrats you win!");
                break;
            }else if(userInput > main.getNumToGuess()){
                System.out.println("You are to High!");
            }else if(userInput < main.getNumToGuess()){
                System.out.println("You are to Low");
            }
        }
        System.out.println("My number was >> " + main.getNumToGuess());
    }

    private void setNumToGuess(int numToGuess){
        this.numToGuess = numToGuess;
    }
    private int getNumToGuess(){
        return numToGuess;
    }

}
