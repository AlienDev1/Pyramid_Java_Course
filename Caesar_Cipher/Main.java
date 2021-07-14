

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Charset utf8 = StandardCharsets.UTF_8;
        


            interact_with_user();



        // if(!messageLog.exists()){
        //     try{

                

        //         System.out.println("Enter a message to encrypt:");
        //         char[] arr = sc.nextLine().toCharArray();
        //         System.out.println("Enter a number to shift");
        //         int change = sc.nextInt();

        //         List<String> decrypted = Arrays.asList(String.valueOf(arr));
                
        //         Files.write(Paths.get("output.txt"), decrypted);

            
        //         ArrayList<Character> encrypt = new ArrayList<>();
        //         for(int i = 0; i < arr.length; i++){
        //             encrypt.add(arr[i] += change);
        //         }
        //         List<String> encrypted = Arrays.asList(String.valueOf(encrypt));
        //         Files.write(Paths.get("output.txt"), encrypted, utf8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        
        //         ArrayList<Character> decrypt = new ArrayList<>();
        //         for(int i = 0; i < arr.length; i++){
        //             decrypt.add(arr[i] -= change);
        //         }
        //         System.out.println(decrypt);

        //     }catch(IOException e){
        //         System.out.println("Looks like we had a problem creating the file");
        //     }
        // }
                  
   }
   private static void interact_with_user(){

       Scanner sc = new Scanner(System.in);
       System.out.println("Do you want to encrypt or decrypt?");
       String user_selection = sc.nextLine().toLowerCase();

       switch(user_selection){
           case "encrypt":
                System.out.println("Enter Message: ");
                String user_message = sc.nextLine();
                System.out.println("Enter key number (1 - 52)");
                int private_key = sc.nextInt();
                encrypt_function(user_message, private_key);
            
            case "decrypt":
                //decrypt_function();    
       }
       sc.close();
   }

    private static void encrypt_function(String str, int key){
        
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i] += key);
        }
        try {
            File file = new File("Encryption\\encrypted.txt");
            file.getParentFile().mkdir();
            file.createNewFile();
            List<String> encrypted = Arrays.asList(String.valueOf(arr));
            Files.write(file.toPath(), encrypted, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        

        } catch (Exception e) {
            System.out.println("Looks like something happened! with encryption");
        }
    }

    private static void decrypt_function(){

    }
}
