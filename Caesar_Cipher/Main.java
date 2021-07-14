

import java.util.*;
import java.nio.*;

public class Main {

    private String checkSum;

    public static void main(String[] args) {
        interact_with_user();
                  
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
                System.out.println("Enter key number (1 - 52)");
                int key = sc.nextInt();
                decrypt_function(key);    
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

    private static void decrypt_function(int key){
        Main main = new Main();
        File file = new File("Encryption\\encrypted.txt");
        
        if(file.exists()){
            try{
                Path path = Paths.get("Encryption/encrypted.txt");
                String read = Files.readAllLines(path).get(0);
                main.setCheckSum(read);
                char[] arr = main.getCheckSum().toCharArray();
                for(int i = 0; i < arr.length; i++){
                    arr[i] = (arr[i] -= key);
                }
                String ans = String.valueOf(arr);
                System.out.println("Your message is: " + ans);
    
            }catch(IOException e){
                System.out.println("Looks like something happened with decryption!");
            }   
        }else
            System.out.println("Looks like your secrete message is not here. Please encrypt a message first!");
        
    }


    private void setCheckSum(String checkSum){
        this.checkSum = checkSum;
    }
    private String getCheckSum(){
        return checkSum;
    }
}
