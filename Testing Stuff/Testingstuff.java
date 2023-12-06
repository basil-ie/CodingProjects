/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Testingstuff {
  
  
  public static void main(String[] args) { 
    
    int [] a = {12, 3, 46, 5, 34, 100};
   
   boolean hasSwapped = true;
   while(hasSwapped)
   {
     hasSwapped = false;
     for(int i=0; i < a.length - 1 ; i++)
     {
       if (a[i] > a[i + 1] )
       {
         //Swap
         int temp = a[i];
         a[i] = a[i + 1 ];
         a[i + 1] = temp;
         hasSwapped = true;
       }
     }
   }
   
    for (int k:a )
    {
      System.out.println(k);
    }
    
         
         
           
     
    
    }
  
      
  
  
  

  
  }



