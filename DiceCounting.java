import java.util.*;
import java.util.Random;

public class DiceCounting {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    int die;
    //Counters
    int count1s = 0, count2s = 0, count3s = 0, count4s = 0, count5s = 0, count6s = 0;
    
    System.out.print("How many times do you want to roll the dice?: ");
    die = input.nextInt();
    
    for (int i = 1; i <= die; i++) {
      int num = (rand.nextInt(7));
      System.out.print(num);
      if (num == 1) {
        count1s++; 
      }
      if (num == 2) {
        count2s++; 
      }
      if (num == 3) {
        count3s++; 
      }
      if (num == 4) {
        count4s++; 
      }
      if (num == 5) {
        count5s++; 
      }
      if (num == 6) {
        count6s++; 
      }
    }//end of for loop
    
    System.out.println("You rolled a 1 " +count1s+ " times.");
    System.out.println("You rolled a 2 " +count2s+ " times.");
    System.out.println("You rolled a 3 " +count3s+ " times.");
    System.out.println("You rolled a 4 " +count4s+ " times.");
    System.out.println("You rolled a 5 " +count5s+ " times.");
    System.out.println("You rolled a 6 " +count6s+ " times.");
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class 