import java.util.Scanner;

public class Method3 {
  //****************** METHODS AREA ***********************
  public static void printer (String w) {
    System.out.println("I am printing " + w);
  }//end printer
  public static void printer (int w) {
    System.out.println("I am printing " + w);
  }//end printer
  public static void printer() {
    System.out.println("Error, please include a variable type");
  }//end printer
  public static int makeNum() {
    return (int)(Math.random() * 100 + 1);
  }//end makeNum
  //Return --> sends back data to the main (where ever it was called from)
  //Code needs to be told exactly what type of varibale is going to be returend! 
  /*
   Overloaded Methods
   Two or more methods can have the same name, if they differe in parameters 
   the complier will use the one that makes the most logical sense. 
   */ 
  //****************** END METHODS AREA *******************
  public static void main (String[] args) {
    //Declarations
    Scanner input = new Scanner(System.in);
    String word;
    
    System.out.print("Please enter a word: ");
    word = input.next();
    int num = makeNum();
    
    
    printer(word);
    printer(num);
    printer(); //Error, please include a variable type. 
    printer( makeNum() );
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class