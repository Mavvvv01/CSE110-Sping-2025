import java.util.Scanner;
public class Task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr1 = new int[n];
    for(int i = 0; i<n; i++){
      System.out.print("Enter a number: ");
      int input = sc.nextInt();
      arr1[i] = input;
    }
    System.out.println("Original Array: ");
    for(int i = 0; i<n; i++){
      System.out.print(arr1[i] + " ");
    }
    for(int i = 0; i < n-1; i++){
      int maxIndex = i;
      for(int j = i+1; j < n; j++){
         if(arr1[j] > arr1[maxIndex]){
            maxIndex = j;
            }
          }
          if(maxIndex != i){
            int temp = arr1[i];
            arr1[i] = arr1[maxIndex];
            arr1[maxIndex] = temp;
            }
        }
        System.out.println("\nSorted Array (Descending): ");
        for(int i = 0; i < n; i++){
          System.out.print(arr1[i] + " ");
        }
    }
}
    
      