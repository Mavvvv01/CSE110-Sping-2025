//Task 5
import java.util.Scanner;
public class Task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    for(int i = 0;i<n;i++){
      System.out.print("Enter a number: ");
      int input = sc.nextInt();
      arr1[i] = input;
    }
    int extra = sc.nextInt();
    boolean match = false;
    for(int i = 0;i<n;i++){
      if(arr1[i]==extra){
        System.out.println(extra + " is at index " + i);
        match = true;
        break;
      }
    }
    if(!match){
      System.out.println("Element not found");
    }
  }
}
        