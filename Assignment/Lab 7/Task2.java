//Task 2
import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int arr[] = {9, -5, 7, 9, -5, 5, 7};
    System.out.println("Before removing duplicates: ");
    for(int i = 0;i<arr.length; i++){
      System.out.print(arr[i] +" ");
    }
      System.out.println();
    for(int i = 0; i<arr.length; i++){
      for(int j = i+1; j<arr.length; j++){
        if(arr[i] == arr[j]){
          arr[j] = 0;
        }
      }
    }
    System.out.println("After replacing duplicates with 0: ");
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
          
    