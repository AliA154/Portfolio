import java.util.Scanner;//allows us to use the scanner 

public class Interactive1 {
  public static void main (String[] args) {
    //Declare the scanner 
    Scanner input = new Scanner(System.in);
    
    String name;
    name = input.nextLine();
    System.out.println("Hello " + name + ", have a nice day!");  
    System.out.print("How old are you?");
    int age = input.nextInt(); 
    System.out.println(name + " You are " + age + " years old");
    System.out.print("What is your GPA from 1.0 to 4.0?");
    double gpa = input.nextDouble();
    System.out.println(name + " your GPA is " + gpa + " ,thats amazing!");
    
    //Rule for interactrive coding 
    //1) import scanner => import java.util.Scanner;
    //2) declare scanner => Scanner input = new Scanner(System.in);
    //3) input.nextLine() => captures the next written String 
    //4) input.nextInt() => captures the next written int. 
    //5) input.nextDouble() => capyures the next written double
    
    input.close();//closes input and gets rid of warning
  
  
  
  }//end main
}//end class 