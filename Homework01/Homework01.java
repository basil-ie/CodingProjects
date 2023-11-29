/**
 Written by Basil Ezenwa
 */
import java.util.Scanner;
public class Homework01 {
  
  //This is the "Choose Your Own Adventure" homework (or as I like to call it, the Pick Your Own Choose-venture).
  //Idk what they really want me to do here lmfao but I'm assuming that I just make it so the program outputs different stuff based on user input. Not that hard I guess.
  public static void main(String[] args) { 
    System.out.println("You wake up in the middle of the night. It's so cold that you can hardly sleep.");
    System.out.println("What do you want to do? Try to go back to bed (1), or change the temperature (2)? Type '1' or '2' to progress.");
    Scanner sc = new Scanner(System.in);
    String choice = sc.nextLine();
    if (choice.equals("1")){
      System.out.println("You try your best to ignore the cold and shut your eyes again. Suddenly, you hear a noise!");
      System.out.println("A genie appears. 'Hello. I am genie made for the purpose of this stupid game. My name is Ligma... why are you smiling? Is my name funny to you?'" );
      System.out.println("Reply to the genie with 'yes' or 'no'.");
      choice = sc.nextLine();
      if (choice.equals("yes")){
        System.out.println("'You dare laugh at me?! Take this!' The genie murders you in cold blood. Gottem. The end.");
      }
      else if (choice.equals("no")){
        System.out.println("'Oh! Thats cool then. Let's eat crumpets togehter.' Y'all eat crumpets. The end lmao.");
      }
          }
    else if (choice.equals("2")){
      System.out.println("You get out of bed and try to make your way to the thermostat. It's dark, and you can't quite see well.");
      System.out.println("You wander through the darkness. How many steps forward do you take? (Pick a number 1 - 10)");
      choice = sc.nextLine();
      if (Integer.parseInt(choice) <= 5){
        System.out.println("You move forward and reach the light switch. You flip it on.");
      }
    }
                       
  }
}
  
 
  

