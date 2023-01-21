import java.util.*;

public class Logic3 {
  public static void main (String[] args) {
    //Declrations
    Scanner input = new Scanner(System.in);
    int num;
    
    //Ask user stuff
    System.out.print("Please enter a number from 1 to 10: ");
    num = input.nextInt();
    
    //Do Stuff
    System.out.println("You entered the number "+num);
    if (num > 10) {
     System.out.println("You gone goofed and enetered a bad number"); 
    }
    else if (num < 1) {
     System.out.println("You gone goofed and enetered a bad number");
    }
    else if (num != 7) {
     System.out.println("BOOOO what a crappy number, Blech.. next time pick a 7"); 
    }
    else {
     System.out.println("You picked a 7... wo0ho0 YESSSSSSSSSS!"); 
    }
    // In java the symbol ! means NOT...
    /*
     TASK: If the user enters a number outside the range of 1-10
     the code will tell them it's a bad number. It will not say if it's divisible by 4 or not
     TASK 2
     Instead of being divisble by 4.. lets find the best number.. my favorite number is 7
     if the user eneters 7 we cheer... otherwise we boo..
     */
    
    String word;
    String secret = "banana";
    System.out.print("What do you think the secret word is? ");
    word = input.next();
    
    if (word.equals(secret)) {
     System.out.println("You got the secret word.");
    }
    else {
     System.out.println("The secret word was "+secret+". Try again next time!"); 
    }
    
    /* Logic with Strings
     We use the method .equals() to compare if two strings are the same. 
     String word = "burger";
     word.equals("burger")=> true
     word.equals("Hot Dog")=> false
     word.equals("Burger")=> false... case sensitivity is a thing...
     String food = "burger";
     word.equals(food)=> true
     
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class 