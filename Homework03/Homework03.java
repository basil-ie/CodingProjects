/**
 Written by Basil Ezenwa.
 */
import java.util.Scanner;
public class Homework03 {
  
  //Genuinely don't get what the hell they even want me to make for this one
  //Apparently its about sorting rectangles based on length, width, and/or area?? What kinda fuckin' dweeb needs to "sort rectangles"?
  //From what I understand, it's up to the user to input how many ever rectangles they want to compare, then input those rectangles' lengths and widths, and be presented with data including:
  //-Each rectangle's area from smallest to largest
  //-Each rectangle's area from largest to smallest
  //-The average area of the rectangles
  //-The minimum and maximum area of the rectangles. 
  //I'm just gonna make what I assume they want me to make, and if that's wrong, then whatever. 
  
  public static void main(String[] args) { 
    
    System.out.println("Welcome to the Rectangle Sorter! This program will allow you to organize a collection of rectangles based on the value of their areas.");
    
    System.out.println("How many different rectangles do you want to compare? Please input a whole number greater than 1.");
    
    Scanner sc = new Scanner(System.in);
    
    double collectionInput = sc.nextDouble();
   
    //^^Literally only made collectionInput the double data type instead of int so that the error message implimentation below would work. Lol. Lmao even. 
    
    while (true){ 
       if ( collectionInput <= 1 || collectionInput % 1 > 0 ){
         System.out.println("Invalid Collection Size! Please try again with a whole number greater than 1.");
         collectionInput = sc.nextDouble();
    }
           else {
              break;
    }
    }
    
    int collectionSize = (int)collectionInput;
    
    //^^I converted the collectionInput data type from double to int through a process called "Typecasting." The code is shown above.
    
    double [] lengthsArr  = new double[ collectionSize ];
    double [] widthsArr  = new double[ collectionSize ];
    
    //^^This is me creating the array that will hold the lengths and widths of each triangle based on the size of the collection the user inputted.
    
    for (int i = 0; i < lengthsArr.length; i++) {
      int rectangleNumber = i + 1;
      System.out.println("Please Input the length of Rectangle "+rectangleNumber+".");
      lengthsArr[i] = sc.nextDouble();
      System.out.println("Please Input the width of Rectangle "+rectangleNumber+".");
      widthsArr[i] = sc.nextDouble();
    }
    
    double [] areasArr = new double[ collectionSize ];
    
    for (int i = 0; i < areasArr.length; i++) {
      areasArr[i] = lengthsArr[i] * widthsArr[i];
      //int rectangleNumber = i + 1;
      //System.out.println("The area of Rectangle "+rectangleNumber+" is "+areasArr[i]+" units squared.");
      //^^Just checking to see if the areas printed as expected.
    }
    
    for (int i = 0; i < areasArr.length - 1 ; i++){
      for (int j = 0; j < areasArr.length - i - 1; j++){
        if (areasArr[j] > areasArr[j + 1] ){
          //The (< or >) sign in the line above determines whether it'll be greatest to least or least to greatest.
          double temp = 0;
          temp = areasArr[j + 1];
          areasArr[j + 1] = areasArr[j];
          areasArr[j] = temp;
        }
      }
    }
    //Finding Max Area of data:
    //Done using a for loop and systematically checking each value
     double maxArea = areasArr[0];
     
     for(int i=0; i<areasArr.length; i++)
     {
       if(maxArea < areasArr[i])
       {
          maxArea = areasArr[i];
       }
     }
     //Finding Min Area of data:
     //Done using a for loop and systematically checking each value
      double minArea = areasArr[0];
     
     for(int i=0; i<areasArr.length; i++)
     {
       if(minArea > areasArr[i])
       {
          minArea = areasArr[i];
       }
     }
     
     //I could have just set the max and the min equal to the index of areasArr that I KNOW holds this value, but since the point of this assignment seems to be algorithms, I did the above instead.
     
     //But... if I DID go that route... check out the BS I learned in the comments below. 
 
    //double minimumArea = areasArr[0];
    //^^ doing double leastArr [] = areasArr then trying to print leastArr[0] at the bottom of the code does not work for some fuckin' reason.
    //I guess it checks how the array (areasArr) has changed when it tries to print at the end??
    //But literally why wtf. 
    //Okay, so short answer re: above: It has to do with how arrays and their variables are stored in memory. 
    
    //Okay, so the assignment asked to sort the array you make for rectangle areas WITHOUT using any built in Array sorting methods that exist in java. You have to raw dog it.
    //The method I used above is called "Bubble Sort" apparently. It swaps the position of adjacent indeces until it's sorted from least to greatest (or greatest to least, dependeing on what you want)
    //Bubble sort is an algorithm that gets less efficient the larger the array you're trying to do it with. 
    //I get HOW it works conceptually but I'll have to take a closer look at the code to get WHY it works.
     //Supposedly, you don't have to know how to code each algorithm from scratch (theres tons, apparently), but you SHOULD know when one would be better to use than another (time/space efficiency)
     //You should also probobably know how it works conceptually.
     
     //Bubble Sort: Least to Greatest
    
    System.out.println("The rectangle's areas ordered from least to greatest are:");
    
   for (int i = 0; i < areasArr.length; i++){
     if (i == areasArr.length - 1){
       System.out.println("and "+areasArr[i]+" units squared.");
     }
       else{
         System.out.print(areasArr[i]+" units squared, ");
       }
     }
   
 //Bubble Sort: Greatest to Least.
   
   for (int i = 0; i < areasArr.length - 1 ; i++){
      for (int j = 0; j < areasArr.length - i - 1; j++){
        if (areasArr[j] < areasArr[j + 1] ){
          //Note the swap of the ">" to "<" to get the ordering from greatest to least.
          double temp = 0;
          temp = areasArr[j + 1];
          areasArr[j + 1] = areasArr[j];
          areasArr[j] = temp;
        }
      }
    }
   
   System.out.println("The rectangle's areas ordered from greatest to least are:");
  
   
   for (int i = 0; i < areasArr.length; i++){
     if (i == areasArr.length - 1){
       System.out.println("and "+areasArr[i]+" units squared.");
     }
       else{
         System.out.print(areasArr[i]+" units squared, ");
       }
     }
   
   double greatestArr [] = areasArr;
   
   System.out.println("The minimum area held by a rectangle in this collection is "+minArea+" units squared.");
   
   System.out.println("The maximum area held by a rectangle in this collection is "+maxArea+" units squared.");
   
   
     
   
         
      
    }
            
      
        
          
      
    

    

    
            
        
    
    
    
      
      
    
    
    
  }
  

  

