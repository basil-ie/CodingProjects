/**
 * Written by Basil Ezenwa.
 */
import java.util.Scanner;
public class Lab01 {
  //The purpose of this program is to have the user input their birthday into the program (using numbers) to have the program output their Zodiac sign.
  
  public static void main(String[] args) { 
    System.out.println("This program will let you know what your Zodiac sign is! Please input your birthday in the format MM/DD.");
    //^So the first thing I'm doing is deciding on the format through which I want users to input birthdays into the programm. 
    //MM/DD is standard for the USA, so I've decided on that. But because the program has to look at multiple digits at once to determine which month/day it is, I may be making this harder than it needs to be.
    //But dammit I'm gonna try anyway bc I think I have an idea of how to do this using arrays. Maybe there's an easier way to do what I've done in the MM/DD format, but whatever! I'm trying this way. 
    //I can think of a couple ways to make this more straightforward code wise (asking for day and month separately, not asking for MM/DD format, etc), but I want to challenge myself to do it this way for the user's convenience.
    Scanner sc = new Scanner(System.in);
    String bday = sc.nextLine();
    //^Birthdays are taken in as Strings to account for leading zeroes and the "/".
    
    /**
    char[] arr = bday.toCharArray();
    for (char t:arr){
      System.out.println(t);
      
      */
    //^This block of code was simply used to test out the String.toCharArray() function to see if/how it worked. It's commented out because it's not necessary to output.  
    
    char[] arr = bday.toCharArray();
    int[] arr2 = new int[arr.length];
    
    //^I created two arrays here; one with the intent of getting our string into a character array (with the String.toCharArray function), and an integer array with the intent of containing the numeric values of the character array.
    
    for (int i=0; i < arr.length; i++){
       arr2[i] = Character.getNumericValue(arr[i]);  
    }
    //A for loop with the "getNumericValue" function attached to the character array was used to successfully create an integer array with each digit of MM/DD its correct index.
   
    //The if/else statements below handle various error messages of invalid date types (ex. 02/30, 13/02, 04/31, 05/53 etc.).
    //This is done by comparing the value of indeces 0, 1, 3, & 4 in arr2 to each other, following what we know must be the case in a calendar year.
    //Notice how index 2 is never considered below. This is because index 2 contained the "/" in the character array, and therefore is irrelevant in the determination of the validity of dates. 
    
    if ( ((arr2[0] >= 2) || (arr2[0] == 1 && arr2[1] > 2)) && ((arr2[3] == 3 && arr2[4] > 1) || arr2[3] > 3)){
      System.out.println("Invalid month and day, please try again!");
    }
    else if ((arr2[0] >= 2) || (arr2[0] == 1 && arr2[1] > 2)){
      System.out.println("Invalid month, please try again!");
    } 
    else if ((arr2[3] == 3 && arr2[4] > 1) || arr2[3] > 3){
      System.out.println("Invalid day, please try again!");
    }
    else if (arr2[0] == 0 && arr2[1] == 2 && arr2[3] > 2){
    System.out.println("Invalid day, please try again!"); 
    }
    else if ((arr2[0] == 0 || arr2[1] == 1) && (arr2[1] == 4 || arr2[1] == 6 || arr2[1] == 1 || arr2[1] == 9) && (arr2[3] == 3 && arr2[4] >= 1)){
    System.out.println("Invalid day, please try again!");
    }
 
    //The code below handles the Zodiac assignments based on the rest of the possible dates. This is the tedious part and I'm almost certain there has to be a better way to do this but alas...
    // Like what if there was a "parse date" function or something like that lmao. Anyway, this is it.
   
  else if ((arr2[0] == 0 && arr2[1] == 1) && arr2[3] >= 2 ) {
      System.out.println("You are an Aquarius!");
    }
  else if ((arr2[0] == 0 && arr2[1] == 2) && (arr2[3] == 0 || (arr2[3] == 1 && arr2[4] <= 8))) {
      System.out.println("You are an Aquarius!");
    }
  else if ((arr2[0] == 0 && arr2[1] == 2) && ((arr2[3] == 1 && arr2[4] == 9) || arr2[3] == 2)) {
      System.out.println("You are a Pisces!");
    }
  else if ((arr2[0] == 0 && arr2[1] == 3) && ((arr2[3] == 2 && arr2[4] == 0) || ((arr2[3] <= 1)))) {
       System.out.println("You are a Pisces!");
  }
  else if ((arr2[0] == 0 && arr2[1] == 3) && (arr2[3] == 2 && arr2[4] >=1) || ((arr2[0] == 0 && arr2[1] == 3) && (arr2[3] == 3 && (arr2[4] == 0 || arr2[4] == 1 )))) {
       System.out.println("You are an Aries!");
  }
  else if ((arr2[0] == 0 && arr2[1] ==4) && arr2[3] <= 1) {
      System.out.println("You are an Aries!");
  }
  else if ((arr2[0] == 0 && arr2[1] ==4) && (arr2[3] == 2 || arr2[3] == 3)){
      System.out.println("You are a Taurus!");
  } 
  else if ((arr2[0] == 0 && arr2[1] ==5) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] == 0 ))) {
      System.out.println("You are a Taurus!");
  }
  else if ((arr2[0] == 0 && arr2[1] ==5) && ((arr2[3] == 2 && arr2[4] > 0 ) || arr2[3] == 3)) {
      System.out.println("You are a Gemini!"); 
  }
  else if ((arr2[0] == 0 && arr2[1] ==6) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] == 0 ))) {
      System.out.println("You are a Gemini!");
  }
  else if ((arr2[0] == 0 && arr2[1] ==6) && ((arr2[3] == 2 && arr2[4] > 0 ) || arr2[3] == 3)) {
      System.out.println("You are a Cancer!"); 
  }
   else if ((arr2[0] == 0 && arr2[1] ==7) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 2 ))) {
      System.out.println("You are a Cancer!");
  }
   else if ((arr2[0] == 0 && arr2[1] ==7) && ((arr2[3] == 2 && arr2[4] > 2 ) || arr2[3] == 3)) {
      System.out.println("You are a Leo!"); 
  }
   else if ((arr2[0] == 0 && arr2[1] ==8) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 2 ))) {
      System.out.println("You are a Leo!");
  }
    else if ((arr2[0] == 0 && arr2[1] ==8) && ((arr2[3] == 2 && arr2[4] > 2 ) || arr2[3] == 3)) {
      System.out.println("You are a Virgo!"); 
  }
    else if ((arr2[0] == 0 && arr2[1] ==9) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 2 ))) {
      System.out.println("You are a Virgo!");
  }
    else if ((arr2[0] == 0 && arr2[1] == 9 ) && ((arr2[3] == 2 && arr2[4] > 2 ) || arr2[3] == 3)) {
      System.out.println("You are a Libra!"); 
  }
    else if ((arr2[0] == 1 && arr2[1] ==0) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 2 ))) {
      System.out.println("You are a Libra!");
  }
    else if ((arr2[0] == 1 && arr2[1] == 0 ) && ((arr2[3] == 2 && arr2[4] > 2 ) || arr2[3] == 3)) {
      System.out.println("You are a Scorpio!"); 
  }
    else if ((arr2[0] == 1 && arr2[1] ==1) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 1 ))) {
      System.out.println("You are a Scorpio!");
  }
    else if ((arr2[0] == 1 && arr2[1] == 1 ) && ((arr2[3] == 2 && arr2[4] > 1 ) || arr2[3] == 3)) {
      System.out.println("You are a Sagittarius!"); 
  }
    else if ((arr2[0] == 1 && arr2[1] ==2) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 1 ))) {
      System.out.println("You are a Sagittarius!");
  }
    else if ((arr2[0] == 1 && arr2[1] == 2 ) && ((arr2[3] == 2 && arr2[4] > 1 ) || arr2[3] == 3)) {
      System.out.println("You are a Capricorn!"); 
  }
    else if ((arr2[0] == 0 && arr2[1] == 1 ) && arr2[3] <= 1){
      System.out.println("You are a Capricorn!"); 
  }
  }
  }
