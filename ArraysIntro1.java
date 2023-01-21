import java.util.*;

public class ArraysIntro1 {
  
  public static void prtArr(String[] arr) {
    for (int i = 0 ; i < arr.length ; i++) {
      System.out.println(arr[i]);
    }//print all the itmes in the array
  }//end prtArr
  public static void prtArr(int[] arr) {
    for (int i = 0 ; i < arr.length ; i++) {
      System.out.println(arr[i]);
    }//print all the itmes in the array
  }//end prtArr
  
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    
    //to declare an array, we put [] next to a variable type
    String[] cars = {"Honda","Jeep","Toyota","Benz","Nissan","Tesla","Bugatti","Beamer"};
    //index             0       1      2        3       4       5        6         7   
    System.out.println("The number of cars is " + cars.length);
    System.out.println("The first car is " + cars[0]);
    System.out.println("The third car is " + cars[2]); 
    System.out.println("The last car is " + cars[cars.length - 1]);
    //Try This.. Print out all the cars in the array
    prtArr(cars);
    //Do this.. create an array called days. Have it store all the days of the week. 
    String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    prtArr(days);
    //Create an array of ints that store the numbers 3, 8, 9, 3, 2
    int[] nums = {3, 8, 9, 3, 2};
    prtArr(nums);
    //change the second 3 in this array to a 10 
    nums[3] = 10;
    prtArr(nums); 
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class 