import java.util.Scanner;

public class Methods4 {
  //****************** METHODS AREA ***********************
  public static void prtSolution(int x) {
    System.out.println("The solution is " + x);
  }//end prtSolution
  public static void prtSolution(double x) {
    System.out.println("The solution is " + x);
  }//end prtSolution
  public static int newNum() {
    return (int)(Math.random() * 9 + 2);
  }//end newNum()
  public static int numDub(int y) {
    return y * 2;
  }//end numDub()
  public static double numHalf(int z) {
    return z / 2.0;
  }//end numHalf()
  //****************** END METHODS AREA *******************
  /* How to define a method.. the PARTS!!
   public -> available to anyone..
   static -> the method is always running
   void/int/any type of variable -> info being returend
   name() -> overload... had to have different parameters
   (parameters) -> info expected from the main
   */ 
  public static void main (String[] args) {
    //Declarations
    Scanner input = new Scanner(System.in);
    
    int num = newNum();
    prtSolution(num);
    num = numDub(num);
    prtSolution(num);
    double num2 = numHalf(num);
    prtSolution(num2);
    prtSolution(numHalf(5));
    
    
    //1) Make a new method called numDub()
    //numDub will accept a number and return the number doubled to the main
    
    //2) Create numHalf() -> it will take  anmuber and half it. it will return
    //the ACCURATE SOLUTION
  
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class