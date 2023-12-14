/**
 Written by Basil Ezenwa
 */

import java.util.Scanner;
import java.util.Random;
public class Homework04 {
  //This is the pot hole avoiding game. Get X to the end of the level or something idk fam lol.
  
  public static void main(String[] args) { 
    superouter:
    //So APPARENTLY, you can label loops. Who knew?! Not me. 
   //Anyway, you can just label them by typing whatever you want to name the loop followed by a colon, followed by the loop.
   //This way, I can specify which loop I want to break with the "break" command.
   //By default, "break" only breaks the loop that it's immediately in. 
   //Plus, it seems like setting a condition and breaking that condition in the middle of a loop WILL NOT stop that loop in the middle of it; seems like the loop will iterate to completion at least one time through. 
      
      while(true)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Pothole Driving! You are represented by 'X'!");
    System.out.println("Get home while avoiding the invisible potholes!");
    
    //First step is creating the field that the player will drive through. It's made using a 2D array that's 10x10. I'm making an array bc the assignment said so.
    
    String [][] field = new String [][] { {"_","_","_","_","_","_","_","_","_","_"}, {"_","_","_","_","_","_","_","_","_","_"}, {"_","_","_","_","_","_","_","_","_","_"}, {"_","_","_","_","_","_","_","_","_","_"}, {"_","_","_","_","_","_","_","_","_","_"},
      {"_","_","_","_","_","_","_","_","_","_"}, {"_","_","_","_","_","_","_","_","_","_"}, {"_","_","_","_","_","_","_","_","_","_"}, {"_","_","_","_","_","_","_","_","_","_"}, {"_","_","_","_","_","_","_","_","_","_"} };
    
   /*
    
    This is the code used to print the matrix. It's commented out here because it's not necessary, but it can be used for reference. 
    
    for (int i = 0; i < field.length; i++)
    {
      for (int j = 0; j < field[0].length; j++)
      {
        System.out.print(field[i][j]);
      }
      System.out.println();
    }
    
    */
    
    Random rand = new Random();

    int carXLocation = rand.nextInt(field[0].length);
    
    int carYLocation = 0;
    
    field[carYLocation][carXLocation] = "X";
    
    int homeLocation = rand.nextInt(field[0].length);
    
    field[field.length - 1][homeLocation] = "^";
    
    int potholeYLocation1 = 0;
    int potholeXLocation1 = 0;
    
    int potholeYLocation2 = 0;
    int potholeXLocation2 = 0;
    
    int potholeYLocation3 = 0;
    int potholeXLocation3 = 0;
    
    int potholeYLocation4 = 0;
    int potholeXLocation4 = 0;
    
    int potholeYLocation5 = 0;
    int potholeXLocation5 = 0;
    
    while(true)
    {
      potholeYLocation1 = rand.nextInt(field.length);
      potholeXLocation1 = rand.nextInt(field[0].length);
      
      potholeYLocation2 = rand.nextInt(field.length);
      potholeXLocation2 = rand.nextInt(field[0].length);
      
      potholeYLocation3 = rand.nextInt(field.length);
      potholeXLocation3 = rand.nextInt(field[0].length);
      
      potholeYLocation4 = rand.nextInt(field.length);
      potholeXLocation4 = rand.nextInt(field[0].length);
      
      potholeYLocation5 = rand.nextInt(field.length);
      potholeXLocation5 = rand.nextInt(field[0].length);
      
      if( field[potholeYLocation1][potholeXLocation1].equals("X") || field[potholeYLocation2][potholeXLocation2].equals("X") ||
         field[potholeYLocation3][potholeXLocation3].equals("X") || field[potholeYLocation4][potholeXLocation4].equals("X") ||
         field[potholeYLocation5][potholeXLocation5].equals("X") || field[potholeYLocation1][potholeXLocation1].equals("^") || field[potholeYLocation2][potholeXLocation2].equals("^") ||
         field[potholeYLocation3][potholeXLocation3].equals("^") || field[potholeYLocation4][potholeXLocation4].equals("^") ||
         field[potholeYLocation5][potholeXLocation5].equals("^"))
      {
        System.out.println("failed lol");
      }
      else
      {
        break;
      }
    }
    
    /*
     
     The commented out code below was simply me visualizing the randomization of potholes to make sure it was working properly.
     
    field[potholeYLocation1][potholeXLocation1] = "H";
    field[potholeYLocation2][potholeXLocation2] = "H";
    field[potholeYLocation3][potholeXLocation3] = "H";
    field[potholeYLocation4][potholeXLocation4] = "H";
    field[potholeYLocation5][potholeXLocation5] = "H";
    
    */
    
  for (int i = 0; i < field.length; i++)
    {
      for (int j = 0; j < field[0].length; j++)
      {
        System.out.print(field[i][j]);
      }
      System.out.println();
    }
  
 outer:
   
  while (true){
  
  System.out.println("Please enter either a -1 (move left), 0 (stay put), or 1 (move right). Enter 9 to quit.");
  
  int input = sc.nextInt();
  
 
  
  while(true)
  {
  
  if ( input == 9)
  {
    System.out.println("Thanks for playing, bye!");
    break superouter;
    
  }
  else if (carXLocation + input >= field[0].length || carXLocation + input < 0 ) 
  {
    System.out.println("Invalid move! Please try again.");
    input = sc.nextInt();
  }
  else if ( input > 1 || input < -1 )
  {
    System.out.println("Invalid move! Please try again.");
    input = sc.nextInt();
  }
  else
  {
   break;
  }
  }
  
  field[carYLocation][carXLocation] = "_";
  
  carXLocation = carXLocation + input;
  
  System.out.println("Please enter either a -1 (move up), 0 (stay put), or 1 (move down). Enter 9 to quit.");
  
  input = sc.nextInt();
  
   while(true)
  {
  
  if ( input == 9)
  {
    System.out.println("Thanks for playing, bye!");
    break superouter;
  }
  else if (carYLocation + input >= field.length || carYLocation + input < 0 ) 
  {
    System.out.println("Invalid move! Please try again.");
    input = sc.nextInt();
  }
  else if ( input > 1 || input < -1 )
  {
    System.out.println("Invalid move! Please try again.");
    input = sc.nextInt();
  }
  else
  {
    break;
  }
  }
   
   carYLocation = carYLocation + input;
   
   field[carYLocation][carXLocation] = "X";
   
   if (field[potholeYLocation1][potholeXLocation1].equals("X") || field[potholeYLocation2][potholeXLocation2].equals("X") ||
         field[potholeYLocation3][potholeXLocation3].equals("X") || field[potholeYLocation4][potholeXLocation4].equals("X") ||
         field[potholeYLocation5][potholeXLocation5].equals("X"))
   {
     System.out.println("OH NO!! You hit a pothole! You lose! Try again? Type '1' to try again, or type '9' to quit.");
     input = sc.nextInt();
     if (input == 1)
     {
       break outer;
     }
     else
     {
       System.out.println("Thank you for playing!");
       break superouter;
     }
   }
   
   else if ( field[field.length - 1][homeLocation].equals("X"))
   {
     System.out.println("You win!! You made it home! Play again? Type '1' to try again, or type '9' to quit.");
     input = sc.nextInt();
     if (input == 1)
     {
       break outer;
     }
     else
     {
       System.out.println("Thank you for playing!");
       break superouter;
     }
   }
   else
   {
    for (int i = 0; i < field.length; i++)
    {
      for (int j = 0; j < field[0].length; j++)
      {
        System.out.print(field[i][j]);
      }
      System.out.println();
    }
   }
    
  }
    }
   
   
            
            
  
  
      
  
  //field[0][carLocation] = "_";
  
  
  
  
        
    

    
   
    
    
    
    
    
      
    
    
  }
  
  
  
}
