/**
 * Written by Basil Ezenwa
 */
import java.util.Scanner;
public class Homework00 {
  
  
  public static void main(String[] args) { 
    //The goal of this program is to accept two four-digit binary numbers from the user, convert them to their decimal values, then add those values together. 
    System.out.println("Hello! This program will help you convert two binary numbers to decimal values, and add those decimal values together.");
    System.out.println("Please enter the first four-digit number in binary.");
    Scanner sc = new Scanner(System.in);
    String bnum1 = sc.nextLine();
    //^First, we use a scanner to get the user to input a binary number into the program as a String. We use a String data type and not an integer to account for any leading zeroes.
    //Remember, we have to import the Scanner package outside of the class before we can do this. 
    char [] arr1 = new char[bnum1.length()];
    for (int i=0; i<bnum1.length(); i++) {
      arr1[i] = bnum1.charAt(i);
    }
    
     //^Next, we convert the four digit binary number (which is currently a String) into a character array. This is the first step to converting the characters to integers.  
      //We use the for loop to determine which number (or character, technically) is at each index by pairing it with the code arr1[i] = bnum1.charAt(i). 
      //I guess the [String].charAt() functionality assigns an index value to each character in a string, which is why this works.
    
    /**
    for(char t:arr1){
      System.out.println(t);
    }
    */
  
    //^The short for each loop above was simply used to test that the binary number was successfully converted into an array.
    //It's commented out right now because once we know it works, it's not necessary to output. 
      
    int [] arr2 = new int[arr1.length];
    for (int i=0; i<arr1.length; i++){
      arr2[i] = Character.getNumericValue(arr1[i]);
    }
    
  //We then use a similar process to convert the character array created from the first binary number into an integer array. 
  //The for loop uses the code Character.getNumericValue() to convert the characters at each index of arr1 into integers, which are then placed in the same index for arr2, the integer index.
  //I had to do it this way because apparently just converting a character to int in java uses ASCII, which doesn't necessarily give numbers their expected value. 
  //For example, I found that the character 0 (zero) is "48" in ASCII... It messed with my formulas for converting to decimals later in the code.
   
   double decnum1 = arr2[0]*Math.pow(2,3) + arr2[1]*Math.pow(2,2) + arr2[2]*Math.pow(2,1) + arr2[3]*Math.pow(2,0);
   System.out.println("The decimal value of your first binary number is "+decnum1+".");
   
   //This section here simply uses the formula [decimal value] = [binary digit 1]*2^3 + [binary digit 2]*2^2 + [binary digit 3]*2^1 + [binary digit 4]*2^0
   //For some reason, java wants exponents (done with that Math.pow(base, exponent) function) to be in the double data type. Thankfully, converting from int to double happens automatically. Probably. 
   
    System.out.println("Please enter the second four-digit number in binary.");
    //Scanner sc2 = new Scanner(System.in);
    bnum1 = sc.nextLine();
    
    //arr1 = new char[bnum1.length()];
    for (int i=0; i<bnum1.length(); i++){
          arr1[i] = bnum1.charAt(i);
          }
    
   //arr2 = new int[arr1.length];
    for (int i=0; i<arr1.length; i++){
      arr2[i] = Character.getNumericValue(arr1[i]);
    }
  
    double decnum2 = arr2[0]*Math.pow(2,3) + arr2[1]*Math.pow(2,2) + arr2[2]*Math.pow(2,1) + arr2[3]*Math.pow(2,0);
   System.out.println("The decimal value of your second binary number is "+decnum2+".");
   
   //This is all simply a copy of the code for the first four digit binary number applied to the second. New variables were used.
   
   double sum = decnum1 + decnum2;
   
   System.out.println("The sum of "+decnum1+" and "+decnum2+" is "+sum+". Thank you for using the program!");
   
   //These last two lines are simple addition.
   
}
}