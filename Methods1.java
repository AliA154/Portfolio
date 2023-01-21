import java.util.Scanner;

public class Methods1 {
  //****************** METHODS AREA ***********************
  public static void prtStars(int stars, String letter) {
    //System.out.println("*********");
    for (int i = 1 ;i <= stars; i++) {
      System.out.print(letter);
    }
    System.out.println();
  }//end prtStars
  //****************** END METHODS AREA *******************
  public static void main (String[] args) {
    //Declarations
    Scanner input = new Scanner(System.in);
    /* Defintion of a method?
     * A Mehtod is a block of a code which only runs when its CALLED.
       You can pass data known as parameters, into a method. Methods
       are used to perfom certain actions.
       Methods live outside the main of our codes.
    */ 
    
    prtStars(10, "*"); //We called our method
    System.out.println("Java");
    prtStars(25, "8^ (|)");
    System.out.println("is");
    prtStars(5, ":)");
    System.out.println("easy");
    prtStars(40, ":o");
  
  
    
    
    
    input.close();
  }//end main
}//end class