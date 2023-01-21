import java.util.*;

public class ArraysIntro2 {
  public static void prtArr(String[] arr) {
  for (int i = 0; i < arr.length - 1; i++) {
    System.out.print(arr[i] + ", ");
    }//end for loop
    System.out.println(arr[arr.length -1]);
   }//ebnd prtArr
  
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    
    String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    prtArr(months);
    
    //You are throwing a VIP pool party
    //There is 5 people on the VIP list
    //Allow the user to enter the people into the list
    System.out.print("How many VIP's are at the party? ");
    int numVIP = input.nextInt();
    
    String[] vipList = new String[numVIP];//Creates a new array with a given size
    for (int i = 0; i < vipList.length ;i++) {
      System.out.print("Please enter name "+(i + 1)+": ");
      vipList[i] = input.next();
    }//end for loop
    prtArr(vipList);
    //TRY THIS!!! the user wants to determine the size of the VIP list..
    //Once they have thier size, they can enter that many names.!
    
    
    
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class