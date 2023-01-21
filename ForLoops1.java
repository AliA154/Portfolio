public class ForLoops1 {
  public static void main (String[] args) {
    
    
    //When code is repatitive, we try to make the computer do the task automatically
    //We want the computer to loop through the task and complete the goal.
    // LOOP => Repititon controlled structure.
    
    // int i ---> Global varibale and it can be used anywhere in the main
    
    for (int i = 3; i <= 12; i++) {//Local Variable, used insde the command its declared in.
      System.out.println(i + " ");
    }//end for loop
    
    /* How does a for loop work?
        
        for ( START ; STOP ; INTERVAL) {
            TASK
        }
      
    */ 
    
    //TASK ---> Have the loop print the numbers from 12 - 27
    for (int a = 10; a > 100; a--) {
     System.out.print("*"); 
     
    }
    
    
  
  
  
  
  
  
  
  }//end main
}//end class