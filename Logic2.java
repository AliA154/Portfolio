import java.util.*; 

public class Logic2 {
  public static void main (String[] args) {
    //Declrations
    Scanner input = new Scanner(System.in);
    int num;
    
    //ask the user stuff 
    System.out.print("Please enter a number: ");
    num = input.nextInt();
    
    //do stuff
    if (num % 2 == 0) {
      System.out.println(num+" is EVEN");
    }//EVEN
    else {
      System.out.println(num+" is ODD");
    }//ODD
    
    /*
     an if statment is a linked chian of events. If the condtion is TRUE, it does the given task.
     if the condition is FALSE, it does the task of the ELSE.
     The chain can NOT be interputted. 
     
     */
    //task
    //Ask the user what tghier favorite food is.. using a number scale
    //1-burger, 2-tacos, 3-salad, 4-pizza,  5-IceCream. 
    System.out.println("\nWhat is your favorite Food?");
    System.out.println("1-Burger");
    System.out.println("2-Taco");
    System.out.println("3-Salad");
    System.out.println("4-Pizza");
    System.out.println("5-IceCream");
    System.out.print("Enter the number of your favorite one: ");
    num = input.nextInt();//GUI 
    
    if (num == 1) {
      System.out.println("You like Burgers");
    }//1
    else if (num == 2) {
      System.out.println("You like Tacos");
    }//2
    else if (num == 3) {
      System.out.println("You like Salad");
    }//3
    else if (num == 4) {
      System.out.println("You like Pizza");
    }//4
    else if (num == 5) {
      System.out.println("You like IceCream");
    }//5
    else {
      System.out.println("You gone goofed and enterd a bad number!"); 
    }
    //else if command. Links mutiple if statments into the same chain of events. It also
    //asks new conditional statments. 
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class 