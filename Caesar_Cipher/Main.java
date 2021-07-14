package com.company;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Charset utf8 = StandardCharsets.UTF_8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to shift");
        int change = sc.nextInt();

        String str = "Hello everyone I am going to be encrypted";
        char [] arr = str.toCharArray();

        ArrayList<Character> encrypt = new ArrayList<>();
        for(int i = 0; i < arr.length -1; i++){
            encrypt.add(arr[i] += change);
        }
        System.out.println(encrypt);

        ArrayList<Character> decrypt = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            decrypt.add(arr[i] -= change);
        }
        System.out.println(decrypt);
    }
}
