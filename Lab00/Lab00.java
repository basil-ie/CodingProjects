/**
 * Written by Basil Ezenwa.
 */
import java.util.Scanner;
//^This is how you import a package. They need to be outside of the Class and the Main Method. They don't need curly braces bc their functionality happens on a different level.
public class Lab00 
  //This is the Class is basically what files are called in java. 
{
  public static void main(String[] args) 
  { //The stuff inside the curly braces is called the Body, btw. 
     System.out.println("Hello World");
     System.out.println("What is your name?");
     Scanner keyboard = new Scanner(System.in);
     //Something to get through your dumb little baby brain is the equals sign (=) is NOT an equals sign like in math in code. It is called an "assignment operator." Whenever you use = you are assigning (OR REASSIGNING) a value to a variable
     String name = keyboard.nextLine();
     System.out.println("Greetings "+name+"!");
     //^By the way, joining Strings together with the plus sign like above is called "concatenation"
     System.out.println("How many cats do you have?");
     int numberofcats = keyboard.nextInt();
     System.out.println("How does one live with "+numberofcats+" cats?");
  
  }
  
 
  
}
