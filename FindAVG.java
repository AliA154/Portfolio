import java.util.*; 

public class FindAVG {
  public static void main (String[] args) {
    //Declrations
    Scanner input = new Scanner(System.in);
    int grade1, grade2, grade3, total, fgrade;
    
    
    System.out.print("Please enter a test score: ");
    grade1 = input.nextInt(); 
    System.out.print("Please enter another test score: ");
    grade2 = input.nextInt();
    System.out.print("Please enter the last test score: ");
    grade3 = input.nextInt(); 
    
    total = (grade1 + grade2 + grade3);
    fgrade = (total / 3);
    System.out.println(fgrade);
    
    if (fgrade > 65) {
     System.out.println("You are PASSING"); 
    }
    else {
     System.out.println("You are FAILING"); 
    }
    
  input.close();  
  }//end main 
}//end class 