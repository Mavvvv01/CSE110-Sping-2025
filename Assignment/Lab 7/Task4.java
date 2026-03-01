//Task 4
import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]arr1 = new int[n];
    for(int i = 0; i<n; i++){
      int input = sc.nextInt();
      arr1[i] = input;
    }
    System.out.println("Original Array: ");    
    for(int i = 0; i<n; i++){
      System.out.print(arr1[i] + " ");
    }
    for(int i = 0; i<n; i++){
      if(arr1[i]>0){
        arr1[i]=1;
      }
      if(arr1[i]<0){
        arr1[i] = 0;
      }
    }
    System.out.println();
    System.out.println("After modifying: ");
    for(int i = 0; i<n; i++){
      System.out.print(arr1[i]+ " ");
    }
  }
}
        