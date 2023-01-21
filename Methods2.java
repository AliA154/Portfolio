import java.util.Scanner;

public class Methods2 {
   //****************** METHODS AREA ***********************
  public static void prtHori(String word) {
    for (int i = 0;i < word.length() ; i++) {
      System.out.print(word.charAt(i)+" ");
    }//end for loop
    System.out.println();
  }//end prtHori
  
  public static void prtVert(String word) {
    for (int i = 0;i < word.length() ; i++) {
      System.out.print(word.charAt(i)+"\n");
    }//end for loop
  }//end prtVert
  
  public static void prtBack (String word) {
    for (int i = word.length() - 1; i >= 0 ;i--) {
      System.out.print(word.charAt(i));
    }//end for loop
    System.out.println();
  }//end prtBackwards
  
  public static void prtAll (String word) {
    prtHori(word);
    prtVert(word);
    prtBack(word);
  }//end prtAll
  public static int mystery(int num1, int num2) {
   int sum = num1+num2;
     mystery2(sum);
     return sum;
  }
  public static void mystery2(int num) {
   System.out.println("The sum of the numbers is " + num); 
  }
   //****************** END METHODS AREA *******************
     
     public static void main (String[] args) {
     //Declarations
     Scanner input = new Scanner(System.in);
     
     prtHori("Hello");//H e l l o
     prtVert("Hello");
     prtBack("Hello");//olleh
     prtAll("Java");//print horiznatal, then prt vertically, then prt backwards
     int happy = mystery(7,3);
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class