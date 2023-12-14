package Practice;
import java.util.Scanner;
import java.util.Random;
/*
  Create a class Game, Which allow user to "guess a number"
  game once. Game should have the following methods:
    1. Constructor to generate random number.
    2. tackUserInput() to tack user input of number 
    3. isCorrectNumber() to detect wether the number by user entered is true or not.
    4. Getter and Setter for number of Guesses
    Use properties such as noOfGuesses(int), etc tom get task done.
  */

public class Game1 {
    private int ComputerGuess;
    private int Mynum;


    public Game1(){
        ComputerGuess = (int)(Math.random()*100);
        // Random random = new Random();
        // int ComputerGuess = random.nextInt(100);
        System.out.println("Computer Guess Number is: "+ComputerGuess);

    }
    

    void tackUserInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number wich you guess: ");
        int x = sc.nextInt();

    }

    boolean isCorrect(){
        if(Mynum == ComputerGuess){
        return true;
    }
            else if(Mynum<ComputerGuess){
                System.out.println("To less...");
            }
            else if (Mynum>ComputerGuess){
                System.out.println("To high....");
            }
        else{
        return false;
    }
}
    // public int isCorrect(){
    //     if(Mynum==ComputerGuess){
    //         return 0;
    //     }
    //     else if(Mynum>ComputerGuess){
    //         return -1;
    //     }
    //     else{
    //         return 1;
    //     }

    
    }
   


    public static void main(String[] args) {
        System.out.println("Note: COMPUTER IS BASSICALY GUESS UNDER 1 TO 100 SO YOU ALSO GUESS UNDER 1 TO 100");
       
        
        Game1 g = new Game1();
       g.tackUserInput();
        g.isCorrect();

    }

