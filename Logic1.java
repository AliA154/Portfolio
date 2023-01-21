import java.util.*;

public class Logic1 {
  public static void main (String[] args){
    //Declrations
    Scanner input = new Scanner(System.in);
    String name, first, last;
    int len;
    
    System.out.print("Please enter your full name: ");
    name = input.nextLine();
    
    
    System.out.println("Your full name is "+name);
    len = name.length();
    System.out.println("The amount of characters in your name is "+len);
    
    //A first name with 9 or more letters is a LONG name!
    first = name.substring(0,name.indexOf(' ')); 
    System.out.println("Your first name is "+first);
    last = name.substring(name.indexOf(' ')+ 1);
    System.out.println("Your last name is "+last); 
    //We need to ask the computer a question. YES or NO... TRUE or FALSE...conditinoal statement
    
    if(first.length() > 8) {
      System.out.println("You have a LONG name");
    }
    if (first.length() < 8) {
      System.out.println("You have SHORT name");
    }
    if (first.length() == 8) {
      System.out.println("You have a PERFECT name");
    } 
    
    
    // = menas to set a variable to a value 
    // == means compare the value inside the conditional statement
    // Symbols we can use in conditionla statements.... <,>,==,>=,<=
    
  
    
    
    
    
    
    input.close(); 
  }//end main 
}//end class 