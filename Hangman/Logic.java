package com.company;

import java.util.Scanner;
import java.util.ArrayList;



public class Logic extends Main{

    //Global Variables
    Scanner sc = new Scanner(System.in);
    String word = "";
    int state = 0;
    ArrayList<Character> missed = new ArrayList<Character>();

    // Game Winning Word Creator
    public String getSecret_word(){

        while(word.length() == 0){
            System.out.printf("Please Enter a 3 letter word >> ");
            word = sc.nextLine();

            if(word.length() == 3){
                return word;
            }else{
                System.out.printf("Enter a word that is 3 letters long >> ");
                word = "null";
            }
            sc.close();
        }
        return word;
    }

    // public String setWord(String word){
    //     this.word = word;
    //     return word;
    // }


    // Checks if word has letter given
    public int check(String word, char ans){

        char [] arr = word.toCharArray();
        ArrayList<Character> compare_list = new ArrayList<Character>();

        for (int x = 0; x < arr.length -1; x++) {

            if(ans != arr[x]){

                missed.add(ans);

            }else{

                compare_list.add(ans);
                state++;
                board_state(state);
                return state;

            }
        }
        return 0;
    }

}

