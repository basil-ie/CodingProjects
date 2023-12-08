/**
 Basil Ezenwa
 */
import java.util.Scanner;
public class Lab04 {
  
  //This is a program that's used to create two matrices and adds them together.
  
  public static void main(String[] args) { 
 
    System.out.println("Hello, and welcome to the Matrix Addition Program!"+"\n"+"Please enter the length of the first matrix");
    Scanner sc = new Scanner(System.in);
    int matrixLength = sc.nextInt();
    System.out.println("Please enter the width of the first matrix");
    int matrixWidth = sc.nextInt();
    
    int [][] matrixOne = new int[matrixLength][matrixWidth];
    
    System.out.println("Please enter the length of the second matrix");
    sc = new Scanner(System.in);
    matrixLength = sc.nextInt();
    System.out.println("Please enter the width of the second matrix");
    matrixWidth = sc.nextInt();
    
    int [][] matrixTwo = new int[matrixLength][matrixWidth];
    //Matrices (remember those??) are basically arrays of arrays. The length and width of the arrays are handled just as I wrote my variables: Length first, width second.
    
    while (true){
      //I had to rewrite all this code in the while loop because I still need the variables outside of this loop.
      //If I define the variables like matrixOne and matrixTwo within the loop, I'll get an error later. 
      //This was the only way I could think to loop this code while also maintaining the variables.
    if ((matrixOne.length != matrixTwo.length) || ( matrixOne[0].length != matrixTwo[0].length ))
      //Notice how getting the length of a matrix is simply the length of the array, while the width of the array is array[0].length.
      //This is because it's the length of the first array in the array that determines what the width is (assuming the array is made up of arrays of equal length).
    {
      System.out.println("Incompatible matrices. Please try again with matrices of equal length and width");
      System.out.println("Please enter the length of the first matrix");
      matrixLength = sc.nextInt();
      System.out.println("Please enter the width of the first matrix");
      matrixWidth = sc.nextInt();
      int [][] swap = new int[matrixLength][matrixWidth];
      matrixOne = swap;
      
      System.out.println("Please enter the length of the second matrix");
      matrixLength = sc.nextInt();
        
      System.out.println("Please enter the width of the second matrix");
      matrixWidth = sc.nextInt();
      int [][] swap2 = new int[matrixLength][matrixWidth];
      matrixTwo = swap2;
    }
    else{
      break;
    }
    }
    
    //I made a double for loop below to be able to get the user to input the value of any index of the matrix they created
    //The way that it works is that it fills out a column of indeces every time the outer loop is completed.
    //The inner loop inputs individual values in a given row. The row that is being filled is determined by the variable k in the outer loop.
    //It's kinda poggers that I figured this out on my own in a couple minutes bc I'm honestly kinda fucking stupid with stuff like this.
    
    for (int k = 0; k < matrixOne.length; k++){
       for (int i = 0; i < matrixOne[0].length; i++){
         System.out.println("Please enter the value at index "+k+", "+i+" in the first matrix.");
         int index = sc.nextInt();
         matrixOne[k][i] = index;
    }
  }
    
     for (int k = 0; k < matrixTwo.length; k++){
       for (int i = 0; i < matrixTwo[0].length; i++){
         System.out.println("Please enter the value at index "+k+", "+i+" in the second matrix.");
         int index = sc.nextInt();
         matrixTwo[k][i] = index;
    }
  }
    //Below is how you get the matrices to print in matrix format. It pretty much reuses the same double for loop I came up with earlier, but with printing shenanigans
     //Notice how the function for the inner loop is System.out.print() and NOT println(). 
     //Every time the inner loop finishes printing all its values (and thus completes a row), the outerloop causes a new line to print with println(). print() just prints on the same line.
      for (int k = 0; k < matrixOne.length; k++){
       for (int i = 0; i < matrixOne[0].length; i++){
         System.out.print(matrixOne[k][i] + " ");   
    }
       System.out.println();
  }
     
    System.out.println("+");
    
    for (int k = 0; k < matrixTwo.length; k++){
       for (int i = 0; i < matrixTwo[0].length; i++){
         System.out.print(matrixTwo[k][i] + " ");   
    }
       System.out.println();
  }
    
     System.out.println("=");
     
      for (int k = 0; k < matrixOne.length; k++){
       for (int i = 0; i < matrixOne[0].length; i++){
        int sum = matrixOne[k][i] + matrixTwo[k][i];
        System.out.print(sum + " ");
    }
       System.out.println();
  }
     
     
  
    
  }
  
 
  
}
