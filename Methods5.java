public class Methods5 {
  //****************** METHODS AREA ***********************
  public static int newNum() {
    // range, then the starting point
    int r = (int)(Math.random() * 21) - 10;//  -10 to 10
    //System.out.println("The number is " + r);
    prtNum(r, "method");
    return r;
  }//end newNum()
  public static void prtNum(int guac) {
    System.out.println("The number is " + guac);
  }//end prtNum
  public static void prtNum(int guac, String loc) {
    System.out.println("The number is " + guac + " printed in the "+loc);
  }//end prtNum
  public static int addThem(int pb, int j) {
    return pb + j;
  }//end addThem()
  //****************** END METHODS AREA *******************
  public static void main (String[] args) {
    
    int num1 = newNum();
    //System.out.println("The number is " + num1 + " printed in the main");
    //prtNum(num1, "main");
    
    int num2 = newNum();
    int sum = addThem(num1, num2);
    prtNum(sum, "toaster");
    
    //TASK -> create a new variable called num2, have it call newNum()
    //        create a new method called addThem(), have it send the sum of
    //        num1 and num2 to a new variable called sum 
    //        use prtNum with sum.
    
    
    
    
    
    
    
    
    /*
    //Experimient.. are the numbers in the range -10 to 10
    int count = 1;
    while (num1 != 10 && num1 != -10 && count <= 100) {
      num1 = newNum();
      System.out.println(count);
      count++;
      if (num1 > 10 || num1 < -10) {
        System.out.println("ERROR");
        break;
      }//end if 
    }//end while loop
    System.out.println(num1);
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
  }//end main
}//end class 