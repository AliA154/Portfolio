import java.util.*;

public class MagicBall {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String question;
    int d1, d2;
    
    System.out.println("Hey there, please enter the question you have: ");
    question = input.nextLine();
    
    d1 = (int)(Math.random()*10+1);
    d2 = (int)(Math.random()*10+1);
    
    Random r = new Random();
    int d = 2;
    if (d==1) {
     System.out.println(d1); 
    }
    else {
     System.out.println(d2); 
    }
    if (d==1) {
     System.out.println("Excellent"); 
    }
    else if (d1 == 2) {
     System.out.println("Certainly"); 
    }
    else if (d1 == 3) {
     System.out.println("Brilliant"); 
    }
    else if (d1 == 4) {
     System.out.println("Fantastic"); 
    }
    else if (d1 == 5) {
     System.out.println("Absolutely"); 
    }
    else if (d1 == 6) {
     System.out.println("Marvelous"); 
    }
    else if (d1 == 7) {
     System.out.println("Yes-defienlty"); 
    }
    else if (d1 == 8) {
     System.out.println("Ideal"); 
    }
    else if (d1 == 9) {
     System.out.println("Do what you please"); 
    }
    else if (d1 == 10) {
     System.out.println("One Hundred Percent"); 
    }
    if (d2 == 1) {
     System.out.println("That should be fine"); 
    }
    else if (d2 == 2) {
     System.out.println("I’ll do my best");
    }
    else if (d2 == 3) {
     System.out.println("Why not");
    }
    else if (d2 == 4) {
     System.out.println("Shouldn’t be a problem");
    }
    else if (d2 == 5) {
     System.out.println("Sounds good");
    }
    else if (d2 == 6) {
     System.out.println("not looking so good");
    }
    else if (d2 == 7) {
     System.out.println("horrendous");
    }
    else if (d2 == 8) {
     System.out.println("NO!!");
    }
    else if (d2 == 9) {
     System.out.println("Hardly");
    }
    else if (d2 == 10) {
     System.out.println("No One");
    }
    
  
   
    input.close();
  }//end main
}//end class 