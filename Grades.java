import java.util.*; 

public class Grades {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    int grades, scores;
    //Counter 
    int count = 0; 
    //Accumulator 
    int sum = 0;
    
    System.out.print("How many grades would you like to enter? ");
    grades = input.nextInt(); 
    
    for (int i = 0; i < grades; i++) {
        System.out.print("Enter Score " + (i + 1) + ": ");
        scores = input.nextInt();
        count += scores;
    }
    System.out.println("The average of the grades is: " + count/grades);
    sum = (count/grades);
    if (sum >= 88.5) {
     System.out.println("You got a A"); 
    }
    else if (sum <= 88.5 && sum >= 75.5) {
     System.out.println("You got a B"); 
    }
    else if (sum <= 75.5 && sum >= 65) {
     System.out.println("You got a C"); 
    }
    else if (sum < 65) {
     System.out.println("You got a F"); 
    }
    
    input.close();   
  }//end main
}//end class