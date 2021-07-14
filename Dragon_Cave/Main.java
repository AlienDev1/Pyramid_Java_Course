package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "You are in a land full of dragons. In front of you."+
                "\n you see two caves. In one cave, the dragons is friendly"+
                "\n and you will share his treasure with you. The other dragon"+
                "\n which cave will you go into? (1 or 2)"+
                "\n Enter 1 or 2 >> "
        );

        int caveChoice = sc.nextInt();
        switch (caveChoice){
            case 1:
                System.out.print(
                        "You approach the cave..."+
                        "\nIt is dark and spooky..."+
                        "\nA large dragon jumps out in front of you! He opens his jaws and..."+
                        "\nGobbles you down in one bite"
                );
                break;

            case 2:
                System.out.println(
                        "You approach the cave..."+
                        "\nIt is dark and spooky..."+
                        "\nA large dragon jumps out in front of you! He opens his jaws and..."+
                        "\nSays here is my treasure I would be honored to share"
                );
                break;

            default:
                System.out.println(
                        "Please walk through one of the two caves"
                );
                break;
        }
    }
}
