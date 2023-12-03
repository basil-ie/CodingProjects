/**
Written by Basil Ezenwa.
 */
import java.util.Scanner;
public class Lab02 {
  
  
  public static void main(String[] args) { 
    //The function of this program is to be a "triangle maker," which takes user input in the form of an integer and outputs a triangle of corresponding size.
    Scanner sc = new Scanner(System.in);
    
      
    System.out.println("Welcome to the Triangle Maker! Please input a whole number to create a triangle of corresponding size.");
    int size = sc.nextInt();
    Boolean x = true;
    while (x == true){
    if (size <= 0){
      System.out.print("Please input a positive whole number greater than zero!");
      size = sc.nextInt();
    }
    else {
      x = false;
    }
    }
   
    //I created a while loop (Game loop??) that will prompt the user to try again should they input a number less than zero. 
    //If the user inputs a valid number, x is assigned the value of false, breaking the while loop and allowing the rest of the code to run.


    String triangle = "";
    //Apparently making a string that's zero characters long is a thing that you can do lmfao. I tried the above code, and it works.
    while (triangle.length() <= size){
      System.out.println(triangle);
      triangle += "*";
    }
    //I made a while loop That adds one asterisk (*) into the string that corresponds to the number that the user input. 
    //This creates the first half of the the triangle! So, for example, if you were to print the result of the above while loop after inputting 3, you'd get
    //*
    //**
    //***
    //The rest of the code below gets the bottom part of the triangle by using a while loop that essentially does the above, but instead takes away an asterisk instead of adding one.
    
    triangle = triangle.substring(0, triangle.length() - 1);
    
   //^^HOWEVER!! The while loop above makes the LENGTH of the "triangle" string equal to size+1, though. 
   //A string of this size is never printed by the program because it breaks the condition of the while loop, but it DOES still get created. 
   //So, I had to subtract one asterisk out of the "triangle" string such that the part below worked as I wanted it to.
   //Making substrings in java works by using the String.substring(INCLUSIVE index of beginning character, EXCLUSIVE index of end character).
   //So, by using triangle.substring(0, triangle.length() - 1 ), I can create a loop that subtracts one character from the string each go around. 
   //BTW, note that creating a substring from string = poo with a length of four characters and giving said substring the parameters (0,4) will simply print the whole string. 
   //This is because the ending index is exclusive in Java, which I think is important to stress. 
   //That's why putting an ending index equal to the length of the string will not yield an error. Anything higher than that WILL, though. 
   
   while (triangle.length() > 0 ){
      triangle = triangle.substring(0, triangle.length() - 1);
      System.out.println(triangle);
   }
    }
      
                        
  
   
      
      
    
    
    
  }  
  
  

  


