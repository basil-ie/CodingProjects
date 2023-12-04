/**
 Written by Basil Ezenwa
 */
import java.util.Scanner;
import java.util.Random;
public class Homework02 {
  //The purpose of this program is to play Rock, Paper, Scissors with the user! 
  //Apparently to make randomly generated content, you have to import the Random package, as I have above the class. 
  
  public static void main(String[] args) { 
    Boolean y = true;
    while (y == true){
      
      //^^This while loop lets the player decide to play the game again (or not) when the game reaches a natural conclusion.
      
    
    System.out.println("Welcome, challenger! Can you defeat the computer in a best 2 out of 3 game of Rock, Paper, Scissors? Let's find out!");
    String [] choices = {"Rock", "Paper", "Scissors"};
    //Okay, so my idea here is to create a string array of Rock, Paper, or Scissors that the computer chooses from.
    //I will then write code such that the program will randomly select a number out of 0, 1, and 2.
    //That randomly selected number will correspond to an index of the String array I created above, which in effect is how I get the computer to randomly choose Rock, Paper, or Scissors.
    //NOTE: seems that choosing a range of indeces in java is always inclusive for the first index, but exclusive for the last index (as I found out in Lab02 with the triangle maker!).
    //This explains why the code to randomly generate a number out of 0, 1, and 2 is rand.nextInt(3): We want everything from index 0 to index 2, and index 3 and beyond is unecessary, as they don't exist!!
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    
//System.out.println(choices[rand.nextInt(3)]);
    //^^The commented out code above was simply me testing out if the random functionality worked.
    System.out.println("Please type 'Rock,' 'Paper,' or 'Scissors' to make your choice!");
    
    //ROUND 1
    
    String playerChoice = sc.nextLine();
    
    String comChoice = choices[rand.nextInt(3)];
    
    int playerScore = 0;
    
    int comScore = 0;
    
    // ^^Just as a note, remember to declare variables that you plan on using outside of loops outside of said loop. 
    //Otherwise the program will return an error bc once the loop is broken, its like it never existed.
    //This is why my choices and scores are declared outside of the while loops below; they need to be used for all possible rounds.
    
    
    Boolean x = true;
    while (x == true){
      
      //A while loop will be used to repeat a given Round in the event that there's a tie, or the user inputs an invalid response. 
    
    
    System.out.println("You threw "+playerChoice+"!! The computer threw "+comChoice+"!!");
    
    if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("You won Round 1!!");
      playerScore++;
      //Another note: Apparently doing playerScore = playerScore++ doesn't work for some reason. I don't really get why.
      //playerScore = playerScore += 1 works though... and so does just playerScore++. I thought playerScore = playerScore++ would be the same thing, but apparently, it's not. 
      //Just something to remember about Java, I guess. Or maybe other languages too, probably. Idk fam. 
      x = false;
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("You won Round 1!!");
      playerScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("You won Round 1!!");
      playerScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("The computer won Round 1!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("The computer won Round 1!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("The computer won Round 1!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else {
      System.out.println("Hey, that's not an option!! Try again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    }
    
    //ROUND 2
    
    System.out.println("Current score -- You: "+playerScore+"   Computer: "+comScore);
    
    System.out.println("Time for Round 2! Please type 'Rock,' 'Paper,' or 'Scissors' to make your choice!"); 
    
    playerChoice = sc.nextLine();
    
    comChoice = choices[rand.nextInt(3)];
    
    x = true;
    //^^Quick note: I reassign the value of x here to be true in order to account for the fact that x must have been made false to break out of the while loop above.
    while (x == true){
    
    System.out.println("You threw "+playerChoice+"!! The computer threw "+comChoice+"!!");
    
    if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("You won Round 2!!");
      playerScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("You won Round 2!!");
      playerScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("You won Round 2!!");
      playerScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("The computer won Round 2!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("The computer won Round 2!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("The computer won Round 2!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else {
      System.out.println("Hey, that's not an option!! Try again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    }
    
    if( playerScore == 2){
      System.out.println("Final score -- You: "+playerScore+"   Computer: "+comScore);
      System.out.println("Congratulations! You win!");
      System.out.println("Play again? Type 'Yes' or 'No.'");
      playerChoice = sc.nextLine();
      if (playerChoice.equals("Yes") || playerChoice.equals("yes") ){
      }
      else {
        System.out.println("Thanks for playing! Bye!");
        y = false;
      }
      
    }
    else if( comScore == 2){
      System.out.println("Final score -- You: "+playerScore+"   Computer: "+comScore);
      System.out.println("Too bad! The computer wins!");
      System.out.println("Play again? Type 'Yes' or 'No.'");
      playerChoice = sc.nextLine();
      if (playerChoice.equals("Yes") || playerChoice.equals("yes") ){
      }
      else {
        System.out.println("Thanks for playing! Bye!");
        y = false;
      }
    }
    else {
      
      //ROUND 3
      
      System.out.println("Current score -- You: "+playerScore+"   Computer: "+comScore);
    
    System.out.println("Time for the Final Round! Please type 'Rock,' 'Paper,' or 'Scissors' to make your choice!"); 
    
    playerChoice = sc.nextLine();
    
    comChoice = choices[rand.nextInt(3)];
    
    x = true;
    while (x == true){
    
    System.out.println("You threw "+playerChoice+"!! The computer threw "+comChoice+"!!");
    
    if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("You won Round 3!!");
      playerScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("You won Round 3!!");
      playerScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("You won Round 3!!");
      playerScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("The computer won Round 3!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("The computer won Round 3!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("The computer won Round 3!!");
      comScore++;
      x = false;
    }
    else if (( playerChoice.equals( "Rock" ) || playerChoice.equals( "rock" ) ) && comChoice.equals( "Rock" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else if (( playerChoice.equals( "Paper" ) || playerChoice.equals( "paper" ) ) && comChoice.equals( "Paper" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else if (( playerChoice.equals( "Scissors" ) || playerChoice.equals( "scissors" ) ) && comChoice.equals( "Scissors" ) ){
      System.out.println("It's a tie! Type 'Rock,' 'Paper,' or 'Scissors' again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    else {
      System.out.println("Hey, that's not an option!! Try again!");
      playerChoice = sc.nextLine();
      comChoice = choices[rand.nextInt(3)];
    }
    }
    
    System.out.println("Final score -- You: "+playerScore+"   Computer: "+comScore);
    
    if ( playerScore > comScore ){
      System.out.println("Congratulations! You win!");
      System.out.println("Play again? Type 'Yes' or 'No.'");
      playerChoice = sc.nextLine();
      if (playerChoice.equals("Yes") || playerChoice.equals("yes") ){
      }
      else {
        System.out.println("Thanks for playing! Bye!");
        y = false;
      }
    }
    else{System.out.println("Too bad! The computer wins!");
      System.out.println("Play again? Type 'Yes' or 'No.'");
      playerChoice = sc.nextLine();
      if (playerChoice.equals("Yes") || playerChoice.equals("yes") ){
      }
      else {
        System.out.println("Thanks for playing! Bye!");
        y = false;
      }
    }
    }
    }
      
      
      
      
    }
    
    
                           
    
  }
  
  

