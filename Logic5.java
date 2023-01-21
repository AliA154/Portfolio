import java.util.*;

public class Logic5 {
  public static void main (String[] args) {
    //Declrations
    Scanner input = new Scanner(System.in);
    String word, word2;
    int len, tries = 1;
    boolean wordCorrect = false;
    
    
    System.out.print("Player 1, please enter your word: ");
    word = input.nextLine();
    
    len = word.length();
    System.out.println("The amount of characters in the secret word is "+len);
    
    System.out.println("Player 2, please try to guess the secret word: ");
    System.out.print("Enter guess here! ");
    word2 = input.nextLine();
    
    char first = word.charAt(0);
    
    
    //Try 1 ---------------------------------------------------------------------------------------------------
    if (word.equals(word2)) {
      System.out.println("You guessed the secret word.. Wohooooo!!!!");
      System.out.println("It only took you "+tries+" tries.");
      wordCorrect = true;
    }
    else {
      System.out.println("WRONGGG!!");     
      System.out.println("The first letter to the secret word is "+first); 
     tries++;
    }
    //Try 2 ---------------------------------------------------------------------------------------------------
    if (wordCorrect == false) {
      System.out.println("Try #2, guess another word: ");
      word2 = input.nextLine();
      
      if (word.equals(word2)) {
      System.out.println("You guessed the secret word... Wohooo!!!!!");
      System.out.println("It only took you "+tries+" tries.");
      wordCorrect = true;
    }
    else {
      System.out.println("WRONGGG!!");     
      System.out.println("The next letter to the secret word is "+word.substring(0,2)); 
     tries++;
     }
    }
    //Try 3 ----------------------------------------------------------------------------------------------------
    if (wordCorrect == false) {
      System.out.println("Try #3, guess another word: ");
      word2 = input.nextLine();
      
      if (word.equals(word2)) {
      System.out.println("You guessed the secret word... Wohooo!!!!!");
      System.out.println("It only took you "+tries+" tries.");
      wordCorrect = true;
    }
    else {
      System.out.println("WRONGGG!!");     
      System.out.println("The next letter to the secret word is "+word.substring(0,3)); 
     tries++;
     }
    }
    //Try 4 ------------------------------------------------------------------------------------------------------
    if (wordCorrect == false) {
      System.out.println("Try #4, guess another word: ");
      word2 = input.nextLine();
      
      if (word.equals(word2)) {
      System.out.println("You guessed the secret word... Wohooo!!!!!");
      System.out.println("It only took you "+tries+" tries.");
      wordCorrect = true;
    }
    else {
      System.out.println("WRONGGG!!");     
      System.out.println("The next letter to the secret word is "+word.substring(0,4)); 
     tries++;
     }
    }
    //Try 5 ------------------------------------------------------------------------------------------------------
    if (!wordCorrect) {
      System.out.println("Last attempt, guess the word, GOOD LUCK: ");
      word2 = input.nextLine();
      
      if (word.equals(word2)) {
      System.out.println("You guessed the secret word... Wohooooo!!!");
      System.out.println("It only took you "+tries+" tries.");
    }
    else {
     System.out.println("YOU LOST... the secret word was "+word); 
     tries++;    
     }
    }
    
    input.close();  
  }//end main
}//end class 