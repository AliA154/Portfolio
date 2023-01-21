import java.util.*;

public class Logic6 {
  public static void main (String[] args) {
    //Declrations
    Scanner input = new Scanner(System.in);
    int temp;
    String weather;
    
    
    //Ask the USer stuff 
    System.out.print("what is the local temperature?");
    temp = input.nextInt();
    System.out.println("Which of the following represetns your local weather condtitons? ");
    System.out.print("Please enter: sunny, cloudy, or rainy");
    weather = input.next().toLowerCase();
    
    //Do Stuff
    /*-----------------------------------NOTES--------------------------------------
     AND OR.. What does it mean?? in a logical viewpoint???
     with an AND statment.. ALL the conditions need to be true for the whole satment to be TRUE
     if a single condition is false, the WHOLE statment is false.
     AND is represented by the symbol &&
     
     With an OR statment.. only ONE condition needs to be true for the whole statment to be TRUE
     and or statment can only be fasle, if every condition is false.
     OR is represnted by the symbol ||
     
     */
    if ( !(weather.equals("sunny") || weather.equals("cloudy") || weather.equals("rainy")) ) {
      System.out.println("You entered an invalid weather condition");
    }
    else {
      /*
       Determine wheeter the temputure is
       HOT 80 or more
       WARM 65 to 80
       COLD 40 or below 
       */
      if (temp >= 80 && weather.eqauls("sunny")) {
       System.out.println("It's a perfect BEACH day"); 
      }
      else if ( (temp >= 65 && temp < 80) && !weather.equals("rainy") ) { 
       System.out.println("Lets take a beautfuil stroll in the park"); 
      }
      else if (temp <= 40 &&  (weather.eqauls("cloudy") || weather.equals("sunny")) ) {
       System.out.println("Lets hit the slopes and SKI"); 
      }
      else {
        Systyem.out.prinln("Lets go to the MOVIES");
    }
  
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class 
