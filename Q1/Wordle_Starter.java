import java.util.Scanner;

public class Wordle_Starter{
    public static void main(String[] args){
        char SecretWord_1 = 'T';
        char SecretWord_2 = 'R';
        char SecretWord_3 = 'A';
        char SecretWord_4 = 'S';
        char SecretWord_5 = 'H';
        Scanner s = new Scanner(System.in);


        for(int i = 0; i < 6; i++)  
        {      
        System.out.println("Enter your first guess, one letter on each line");
        char guess_1 = s.next().charAt(0);
        char guess_2 = s.next().charAt(0);
        char guess_3 = s.next().charAt(0);
        char guess_4 = s.next().charAt(0);
        char guess_5 = s.next().charAt(0);

        System.out.println("Here is feedback on your guess:");
        
        

        if(guess_1 == SecretWord_1)
        {
            System.out.println("This char is correct!");    
        }
        else if(guess_1 == SecretWord_2 || guess_1 == SecretWord_3 || guess_1 == SecretWord_4 || guess_1 == SecretWord_5)
        {
            System.out.println(guess_1 + " is in the word, but not the right place.");
        }
        else
        {
            System.out.println(guess_1 + " is not in the word.");
        }
        


        if(guess_2 == SecretWord_2)
        {
            System.out.println("This char is correct!");    
        }
        else if(guess_2 == SecretWord_1 || guess_2 == SecretWord_3 || guess_2 == SecretWord_4 || guess_2 == SecretWord_5)
        {
            System.out.println(guess_2 + " is in the word, but not the right place.");
        }
        else
        {
            System.out.println(guess_2 + " is not in the word.");
        }
        
        
        if(guess_3 == SecretWord_3)
        {
            System.out.println("This char is correct!");    
        }
        else if(guess_3 == SecretWord_1 || guess_3 == SecretWord_2 || guess_3 == SecretWord_4 || guess_3 == SecretWord_5)
        {
            System.out.println(guess_3 + " is in the word, but not the right place.");
        }
        else
        {
            System.out.println(guess_3 + " is not in the word.");
        }


        if(guess_4 == SecretWord_4)
        {
            System.out.println("This char is correct!");    
        }
        else if(guess_4 == SecretWord_1 || guess_4 == SecretWord_2 || guess_4 == SecretWord_3 || guess_4 == SecretWord_5)
        {
            System.out.println(guess_4 + " is in the word, but not the right place.");
        }
        else
        {
            System.out.println(guess_4 + " is not in the word.");
        }



        if(guess_5 == SecretWord_5)
        {
            System.out.println("This char is correct!");    
        }
        else if(guess_5 == SecretWord_1 || guess_5 == SecretWord_2 || guess_5 == SecretWord_3 || guess_5 == SecretWord_4)
        {
            System.out.println(guess_5 + " is in the word, but not the right place.");
        }
        else
        {
            System.out.println(guess_5 + " is not in the word.");
        }
    
        } 

        /************
         * TO DO:
         *  1. Write some code that compares each letter in the guess
         *      To each letter in the SecretWord
         *  2. For each letter in the guess, print out one of these messages:
         *      - "This char is correct!"
         *      - "This char is in the word, but not in the correct position"
         *      - "This char is not in the word"
         *  3. Put this whole thing in a loop - allow 6 guesses
        */

    }
}