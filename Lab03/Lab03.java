/**
 Written by Basil Ezenwa.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Lab03 {
  /*
  Okay, so like I think the point of this program is to take user input in the form of ten day temperatures in a given winter, 
  find the average temperature of those ten days, and tell the user which of those days were below average temperature.
  */
  
  public static void main(String[] args) {
    System.out.println("Hello! This program will find the average temperature of ten different winter days, and list which days saw temperatures that were colder than that average!");
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the temperature of Day 1 in Fahrenheit.");
    Double day1 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 2 in Fahrenheit.");
    Double day2 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 3 in Fahrenheit.");
    Double day3 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 4 in Fahrenheit.");
    Double day4 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 5 in Fahrenheit.");
    Double day5 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 6 in Fahrenheit.");
    Double day6 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 7 in Fahrenheit.");
    Double day7 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 8 in Fahrenheit.");
    Double day8 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 9 in Fahrenheit.");
    Double day9 = sc.nextDouble();
    System.out.println("Please input the temperature of Day 10 in Fahrenheit.");
    Double day10 = sc.nextDouble();
    
    Double dayArr [] = {day1, day2, day3, day4, day5, day6, day7, day8, day9, day10};
    
    Double sum = 0.0;
    
    for (int i = 0; i < dayArr.length; i++){
      sum = sum + dayArr[i];
      // ^^Made a for loop to add up all the indeces of the array. 
      //Sum begins with the value of zero, and with each subsequent loop, it gains the value of dayArr[i] added to all previously looped indeces until the condition is broken. 
    }
    
    Double averageTemp = sum / dayArr.length;
    //^^Simply found the average temperature by dividing the sum by the length of the array (i.e, the number of days).
     
    System.out.println("The average temperature was "+averageTemp+" degrees Fahrenheit.");
    
    
    
    ArrayList<Double> list = new ArrayList<Double>(); 
    //^^Learned how to use ArrayLists. It seems like lists are useful for when you don't know what your array length is gonna be. 
    
   Boolean x = true;
   
    for (int i = 0; i < dayArr.length; i++){ 
      if ( dayArr[i] < averageTemp ){
        while (x == true){
        System.out.println("The days that had temperatures below average were");
        x = false;
        //Did some tomfoolery with this while loop to only get it to print once in the event that there are days that have temperatures below average.
        //If I just left the string above in here without this while loop, it would print every time a temperature met the conditions of the for loop.
      }
        int dayNumber = i + 1;
        //^^To get the program to print the actual day number, I had to do i + 1 to account for the fact that arrays begin counting from 0.
        System.out.println("Day "+ dayNumber +" with a temperature of "+dayArr[i]+" degrees Fahrenheit.");
        list.add( dayArr[i] );
      } 
    }
    if ( list.size() == 0 ){
      //Finding the length of a list doesn't use .length like other things, but instead uses .size().
      System.out.println("There were no days with temperatures below average.");
    }
    
    
    
    
    
  }
  
  
  
}
