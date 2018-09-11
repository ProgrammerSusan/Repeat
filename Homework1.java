/*
Hatem
hw0906
https://github.com/ProgrammerSusan/Repeat
*/

import java.util.*;

public class Homework1{
public static void main(String[] args){

   Scanner keyboard = new Scanner(System.in);   
   System.out.println("Please specify how long you want your array to be");
    int length = keyboard.nextInt();
    int [] arr = new int[length];
      
   System.out.println("Enter your values into the array");
     for(int i=0; i < arr.length; i++){
         arr[i] = keyboard.nextInt();
     }
   
   System.out.println("Enter the number of times you would like to repeat your array");
    int reps = keyboard.nextInt();
    int[] b = repeat(arr, reps);
   
   System.out.println("Your first array: ");
    printArray(arr);
   System.out.println("Your repeated array: ");
    printArray(b);

}

public static void printArray(int[] array){
   System.out.print("{");
   for(int m=0; m<array.length; m++){
      System.out.print(" " + array[m] + " ");
   }
   System.out.print("}");
   System.out.println();   
}

public static int[] repeat(int[] a, int factor){
   int[] repeated;
   if(factor<=0){
      repeated = new int[0];
   }
   else{
      factor = factor * a.length;
      repeated = new int[factor];
      int count = 0;
      for(int c = 0; c < repeated.length; c++){
         if(count == a.length){
            count = 0;
         }
         repeated[c] = a[count];
         count++;
      }
   } 
   return repeated;    
}

}
