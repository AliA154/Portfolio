import java.util.Scanner; 

public class Madlibs {
  public static void main (String [] args) {
  Scanner input = new Scanner(System.in); 
  
  System.out.print("Enter a Adjective =>");
  String adj1;
  adj1 = input.nextLine(); 
  System.out.print("Enter your name =>");
  String name;
  name = input.nextLine();  
  System.out.print("Enter another Adjective =>");
  String adj2;
  adj2 = input.nextLine(); 
  System.out.print("Input a Noun =>");
  String noun;
  noun = input.nextLine();
  System.out.print("Insert a Verb =>");
  String verb;
  verb = input.nextLine(); 
  System.out.print("Pick a animal =>");
  String animal;
  animal = input.nextLine();
  System.out.print("Write a verb-ing =>");
  String verbing;
  verbing = input.nextLine();
  System.out.print("Enter any adverb =>");
  String adverb;
  adverb = input.nextLine(); 
  System.out.print("What is your age =>");
  int age;
  age = input.nextInt(); 
  
  System.out.println("They say my school is Haunted; my\n" + adj1 + " friend " + name + " says he saw\na " + adj2 +"\t" + noun + " floating at the end of\nthe hall near the cafeteria. Some say if\nyou " + verb + " down that hallway at night\nyou'll hear a " + animal +"\t" + verbing +"\t" + adverb + " \nMany say it could be as long as " + age + " feet ");
    
  
  
  
  input.close();
  }//end main
}//end class 