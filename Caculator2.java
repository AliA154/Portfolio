import java.util.*;

public class Caculator2 {
  public static void main (String[] args) {
    //Declarations
    
    /*
    int num;
    
    System.out.print("Please enter a number: ");
    num = input.nextInt();
    
    if (num % 3 == 0 && num % 2 ==1) {//num % 2 ==1
     System.out.println("That is a special number!!!"); 
    }
    else {
     System.out.println("That is a BORING number =( "); 
    }
    
    TASK: Create a 4 function calculator... + - x /
    The code will display a GUI for the user.
    1. addiition
    2. subtracion
    3. multiplication
    4. division
    The user will enter thier choice, enter thier numbers, it will show all work and the soultion
    
    */
    Scanner input = new Scanner(System.in);
    int num1, num2, choice;
    
    System.out.println("Welcome to Lebo's Calculator of Awesomeness");
    System.out.println("Please enter one of the following choices: ");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Square a number");
    System.out.println("6. Raise a number to a power");
    System.out.println("7. Find the Square Root");
    System.out.println("8. Find the nth root of a number");
    System.out.print("Enter your choice here: ");
    choice = input.nextInt();
    
    if (choice <= 7 && choice >=1) {
       System.out.print("Enter the first number: ");
       num1 = input.nextInt();
       System.out.print("Enter the second number: ");
       num2 = input.nextInt();
     if (choice == 1) {
       
       System.out.print("Enter the first number: ");
       num1 = input.nextInt();
       System.out.print("Enter the second number: ");
       num2 = input.nextInt();
       System.out.println(num1+" + "+num2+" = "+ (num1+num2));
     }
     else if (choice == 2) {
       
       System.out.print("Enter the first number: ");
       num1 = input.nextInt();
       System.out.print("Enter the second number: ");
       num2 = input.nextInt();
       System.out.println(num1+" - "+num2+" = "+ (num1-num2));
     }
     else if (choice == 3) {
       
       System.out.print("Enter the first number: ");
       num1 = input.nextInt();
       System.out.print("Enter the second number: ");
       num2 = input.nextInt();
       System.out.println(num1+" x "+num2+" = "+ (num1*num2));
       
     }
     
     else if (choice == 4) {
       
       System.out.print("Enter the first number: ");
       num1 = input.nextInt();
       System.out.print("Enter the second number: ");
       num2 = input.nextInt();
       System.out.println(num1+" / "+num2+" = "+ ((double)num1/num2));
     }
     else if (choice == 5) {//square a number
       
       System.out.print("Enter the first number: ");
       num1 = input.nextInt();
       System.out.println(num1+"^2 = "+ (num1*num1));
     
     }
     else if (choice == 6) {//raise to a power
       
       System.out.print("Enter the base number: ");
       num1 = input.nextInt();
       System.out.print("Enter the power to raise to: ");
       num2 = input.nextInt();
       System.out.println(num1+"^"+num2+" = "+ (Math.pow(num1,num2)));//we need help.. Use a built OBJECT.. MATH...
       //Math.pow(base, exponent)
     }
     else if (choice == 7) {//square root
       
       System.out.print("Enter the number to find the square root: ");
       num1 = input.nextInt();
       System.out.println("The Sqaure Root of "+num1+" = "+ (Math.sqrt(num1)) );//Math.sqrt()
     
     }
    }
    else {
     System.out.println("<<ERROR ERROR ERROR ERROR ERROR YOU GONE GOFFED AND PUT A BAD CHOICE IN>> TRY AGAIN LATER");
    }
    
    /*
     1. Math.PI => uses the number pui
     2. Math.abs(NUMBER) => absoulte value
     3. Math.pow(b,e) => find the base rasied to the exponent
     4. Math.sqrt(NUMBER) => find the sqare root
     
     */
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class
