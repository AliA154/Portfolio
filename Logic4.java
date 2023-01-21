import java.util.*;

public class Logic4 {
  public static void main (String[] args) {
    //Declrations
    Scanner input = new Scanner(System.in);
    int num1, num2, tries = 1;
    //flag..will check to see if player 2 won the game 
    boolean numCorrect = false;
    


    //Ask User Stuff
    System.out.print("Player 1, please enter your secret number from 1 - 100: ");
    num1 = input.nextInt();
    
    System.out.println("Player 2, please try to guess the secret number 1 - 100: ");
    System.out.print("Enter guess here! ");
    num2 = input.nextInt();
    
    //Do Stuff
    //try 1 -----------------------------------------------------------------------------------------
    if (num1 == num2) {
      System.out.println("You guessed the number CORRECT!!");
      System.out.println("It only took you "+tries+" tries.");
      numCorrect = true;
    }
    else {
     System.out.println("WRONG... Try again"); 
     tries++;    
     /*
      Hint to help the user.. Hot Warm Cold 
      Hot within 5 numbers away
      Warm within 15 numbers away
      Cold more than 15
      Hiking on mile marker 7, how far are you from marker 3, from Marker 11?
      absoulte vale => Math.abs(NUMBER)
      */
     if (Math.abs(num1-num2) <= 5) {
      System.out.println("Your so HOT"); 
     }
     else if (Math.abs(num1-num2) <= 15) {
      System.out.println("Your so WARM"); 
     }
     else {
      System.out.println("Your COLD.. BURRRRRRRRR"); 
     }
    
    }
    
    
    // try 2 ----------------------------------------------------------------------------------------
    if (numCorrect == false) {
      System.out.println("Try #2, pick another number: ");
      num2 = input.nextInt();
      //we need to use Logic inside this if statment 
      //we use a nested if stamtent.. a whole new logic chian, inside another logic chain
      if (num1 == num2) {
      System.out.println("You guessed the number CORRECT!!");
      System.out.println("It only took you "+tries+" tries.");
      numCorrect = true;
    }
    else {
     System.out.println("WRONG... Try again"); 
     tries++;//tries = tries + 1   
    }
    if (Math.abs(num1-num2) <= 5) {
      System.out.println("Your so HOT"); 
     }
     else if (Math.abs(num1-num2) <= 15) {
      System.out.println("Your so WARM"); 
     }
     else {
      System.out.println("Your COLD.. BURRRRRRRRR"); 
     }
    }//end try 2 if
    
    // try 3 ----------------------------------------------------------------------------------------
    if (!numCorrect) {
      System.out.println("Last attempt, pick a differnt number, GOOD LUCK: ");
      num2 = input.nextInt();
      //we need to use Logic inside this if statment 
      //we use a nested if stamtent.. a whole new logic chian, inside another logic chain
      if (num1 == num2) {
      System.out.println("You guessed the number CORRECT!!");
      System.out.println("It only took you "+tries+" tries.");
      
    }
    else {
     System.out.println("WRONG... the number was"+num1); 
     tries++;    
    }
      
    }//end of try 3
    
    
    
    
    input.close();  
  }//end main
}//end class