//Task 3
import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array");
    int length = sc.nextInt();
    int[]arr1 = new int[length];
    int[]arr2 = new int[length];
    for(int i = 0; i<length;i++){
      System.out.print("Enter a number: ");
      int input = sc.nextInt();
      arr1[i] = input;
    }
    for(int i = 0; i<arr1.length; i++){
      arr2[i] = arr1 [length - 1-i];
    }
    System.out.println("Reversed using a new array: ");
    for(int i = 0;i<arr2.length;i++){
      System.out.print(arr2[i]+" ");
    }
    for(int i = 0; i<arr1.length/2;i++){   
      int temp = arr1[i];
      arr1[i] = arr1[arr1.length-1-i];
      arr1[arr1.length-1-i] = temp;
    }
    System.out.println();
    System.out.println("Reversed the original array: ");
    for(int i = 0; i<arr1.length; i++){
      System.out.print(arr1[i] + " ");
    }
  }
}
      
    
    
    
    
    