package daena;

import java.util.Scanner;

/**
 *
 * Take user input of a number
 * based on that number, create a for loop that runs as many times as the user specified.
 * Go through the alphabet printing each letter.
 * 
 * if user gives 5
 * print abcde
 * if user gives 26
 * abcdefghijklmnopqrstuvwxyz
 */
public class Daena {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number.");
        
        char firstLetter = 'a';
        int userNumber = input.nextInt();
        for(int a = 0; a < userNumber; a++) {
            System.out.println(firstLetter);
            firstLetter++;
        }
    }
    
}
