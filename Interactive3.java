import java.util.Scanner;

public class Interactive3 {
  public static void main (String [] args) {
   Scanner input = new Scanner(System.in); 
   
   double you, friend1, friend2, friend3;//mutiple item declaration
   
   System.out.print("How much money do you have?");
   you = input.nextDouble();
   System.out.print("How much money does friend1 have?");
   friend1 = input.nextDouble();
   System.out.print("How much money does friend2 have?");
   friend2 = input.nextDouble();
   System.out.print("How much money does friend3 have?");
   friend3 = input.nextDouble(); 
   
   double total = you+friend1+friend2+friend3;
   System.out.println("Total money combined = "+total);
   //price of the item??? 
   System.out.print("How much is the item? "); 
   double price = input.nextDouble();
   //figure out if the price leaves you with pos or nev money 
   System.out.println("you will have "+ (total-price) +" remainig"); 
   
   
   
   
   
   
   
   
   
   
    
    
    
    
    
    
  input.close();  
  }//end main
}//end class 