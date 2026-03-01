import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int [n];
    for(int i = 0; i<n; i++){
    System.out.print("Enter a number: ");
    int input = sc.nextInt();
    arr1[i] = input;
    }
    System.out.println("The elements of the array are: ");
    for(int i = 0;i<n; i++){
      System.out.println(i + ": " + arr1[i]);
    }
    System.out.println("Enter another number: ");
    int extra = sc.nextInt();
    int[]arr2 = new int[n+1];
    for(int i = 0;i<n; i++){
      arr2[i] = arr1[i];    
    }
    arr2[n] = extra;
    System.out.println("After resizing the array: ");
    for(int i = 0; i<n+1; i++){
      System.out.print(arr2[i] + " ");
  }
}
}
      