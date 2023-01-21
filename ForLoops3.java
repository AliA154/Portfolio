import java.util.*;

public class ForLoops3 {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in); 
    int stop, start, incr;
    
    
    
    System.out.print("what number shall we start at? ");
    start = input.nextInt();
    System.out.print("what number shall we stop at? ");
    stop = input.nextInt();
    System.out.print("How much shall we increase by? ");
    incr = input.nextInt();
    



    //TASK 1 --> using the previous loop, have the user pick the number it will start at!
    //TASK 2 --> Using the loop below, the user picks how much the numbers go up by!.
    
    if (start <= stop && incr > 0           ) {
    for (int i = start; i <= stop ; i+=incr) {
     System.out.println(i); 
    }
   }
    else {
     System.out.println("ERROR ERROR ERROR.... YOU GONE GOOFED!!! "); 
    }
    
    
    
    






 
  
  
  input.close();
  }//end main
}//end class