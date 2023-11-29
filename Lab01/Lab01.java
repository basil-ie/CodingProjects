/**
 * Written by Basil Ezenwa.
 */
import java.util.Scanner;
public class Lab01 {
  //The purpose of this program is to have the user input their birthday into the program (using numbers) to have the program output their Zodiac sign.
  
  public static void main(String[] args) { 
    Boolean x = true;
    while (x == true){
      //I put this whole ass code in a giant while loop to allow for the user to test birthdays over and over again.
      //Apparently this is the only way to repeat sections of code in Java, according to Google. Apparently.
      //If the user does not wish to continue, I assign the Boolean x the value of false, which breaks the while loop and therefore stops the program. 
    System.out.println("This program will let you know what your Zodiac sign is! Please input your birthday in the format MM/DD.");
    //^So the first thing I'm doing is deciding on the format through which I want users to input birthdays into the programm. 
    //MM/DD is standard for the USA, so I've decided on that. But because the program has to look at multiple digits at once to determine which month/day it is, I may be making this harder than it needs to be.
    //But dammit I'm gonna try anyway bc I think I have an idea of how to do this using arrays. Maybe there's an easier way to do what I've done in the MM/DD format, but whatever! I'm trying this way. 
    //I can think of a couple ways to make this more straightforward code wise (asking for day and month separately, not asking for MM/DD format, etc), but I want to challenge myself to do it this way for the user's convenience.
    
    Boolean y = true;
    while (y == true){
      //I made this smaller while loop in the bigger while loop to automatically get the user to retry should they input an invalid date. I just didn't want the introductory text to repeat in this case lol.
      // If the user enters a valid date, then the Boolean y is set to false, breaking this loop.
      

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
      System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        //Supposedly, strings in Java have to be compared using the .equals() function and cannot use ==. I tried this section using == before, and it didn't work. The more you know!
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
    }
  else if ((arr2[0] == 0 && arr2[1] == 2) && (arr2[3] == 0 || (arr2[3] == 1 && arr2[4] <= 8))) {
      System.out.println("You are an Aquarius!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
    }
  else if ((arr2[0] == 0 && arr2[1] == 2) && ((arr2[3] == 1 && arr2[4] == 9) || arr2[3] == 2)) {
      System.out.println("You are a Pisces!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
    }
  else if ((arr2[0] == 0 && arr2[1] == 3) && ((arr2[3] == 2 && arr2[4] == 0) || ((arr2[3] <= 1)))) {
       System.out.println("You are a Pisces!");
        System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
  else if ((arr2[0] == 0 && arr2[1] == 3) && (arr2[3] == 2 && arr2[4] >=1) || ((arr2[0] == 0 && arr2[1] == 3) && (arr2[3] == 3 && (arr2[4] == 0 || arr2[4] == 1 )))) {
       System.out.println("You are an Aries!");
        System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
  else if ((arr2[0] == 0 && arr2[1] ==4) && arr2[3] <= 1) {
      System.out.println("You are an Aries!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
  else if ((arr2[0] == 0 && arr2[1] ==4) && (arr2[3] == 2 || arr2[3] == 3)){
      System.out.println("You are a Taurus!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  } 
  else if ((arr2[0] == 0 && arr2[1] ==5) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] == 0 ))) {
      System.out.println("You are a Taurus!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
  else if ((arr2[0] == 0 && arr2[1] ==5) && ((arr2[3] == 2 && arr2[4] > 0 ) || arr2[3] == 3)) {
      System.out.println("You are a Gemini!"); 
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
  else if ((arr2[0] == 0 && arr2[1] ==6) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] == 0 ))) {
      System.out.println("You are a Gemini!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
  else if ((arr2[0] == 0 && arr2[1] ==6) && ((arr2[3] == 2 && arr2[4] > 0 ) || arr2[3] == 3)) {
      System.out.println("You are a Cancer!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
   else if ((arr2[0] == 0 && arr2[1] ==7) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 2 ))) {
      System.out.println("You are a Cancer!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
   else if ((arr2[0] == 0 && arr2[1] ==7) && ((arr2[3] == 2 && arr2[4] > 2 ) || arr2[3] == 3)) {
      System.out.println("You are a Leo!"); 
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
   else if ((arr2[0] == 0 && arr2[1] ==8) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 2 ))) {
      System.out.println("You are a Leo!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 0 && arr2[1] ==8) && ((arr2[3] == 2 && arr2[4] > 2 ) || arr2[3] == 3)) {
      System.out.println("You are a Virgo!"); 
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 0 && arr2[1] ==9) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 2 ))) {
      System.out.println("You are a Virgo!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 0 && arr2[1] == 9 ) && ((arr2[3] == 2 && arr2[4] > 2 ) || arr2[3] == 3)) {
      System.out.println("You are a Libra!"); 
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 1 && arr2[1] ==0) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 2 ))) {
      System.out.println("You are a Libra!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 1 && arr2[1] == 0 ) && ((arr2[3] == 2 && arr2[4] > 2 ) || arr2[3] == 3)) {
      System.out.println("You are a Scorpio!"); 
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 1 && arr2[1] ==1) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 1 ))) {
      System.out.println("You are a Scorpio!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 1 && arr2[1] == 1 ) && ((arr2[3] == 2 && arr2[4] > 1 ) || arr2[3] == 3)) {
      System.out.println("You are a Sagittarius!"); 
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 1 && arr2[1] ==2) && (arr2[3] <= 1 || (arr2[3] == 2 && arr2[4] <= 1 ))) {
      System.out.println("You are a Sagittarius!");
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 1 && arr2[1] == 2 ) && ((arr2[3] == 2 && arr2[4] > 1 ) || arr2[3] == 3)) {
      System.out.println("You are a Capricorn!"); 
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
  }
    else if ((arr2[0] == 0 && arr2[1] == 1 ) && arr2[3] <= 1){
      System.out.println("You are a Capricorn!"); 
       System.out.println("Test another birthday? (Type 'Yes' or 'No')");
      String answer = sc.nextLine();
      if (answer.equals("no") || answer.equals("No")){
        System.out.println("Thank you for using the program!");
        y = false;
        x = false;
      }
      else {
      System.out.println("Input another birthday in the format MM/DD.");
      }
      
  }
  }
  }
  }
}


