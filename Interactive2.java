import java.util.Scanner; 
public class Interactive2 {
  public static void main (String[] args){
  Scanner input = new Scanner(System.in);  
  
  System.out.print("What would you like, Burger or Chicken Sandwich?");
  String food;
  food = input.nextLine();
  System.out.print("How many nuggets do you want, 6, 10, or 100 piece?");
  int nuggets;
  nuggets = input.nextInt();
  System.out.print("Which size fries would you like, large, huge, or way too many?");
  String fries;
  fries = input.next();    
  System.out.print("What Beverage would you like to order?"); 
  String beverage; 
  beverage = input.next();
  
    
    
    
    
  System.out.println("I would like a " + food + " and " + nuggets + " piece nuggets with " + fries + " fries and a " + beverage);
  input.close();
  
  
  
  }//end main
}//end class 