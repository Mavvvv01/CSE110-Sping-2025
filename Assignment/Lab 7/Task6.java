//Task 6
import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] arr1 = new double[n];
    for(int i = 0;i<n;i++){
      System.out.print("Enter a number: ");
      double input = sc.nextDouble();
      arr1[i] = input;
    }
    int highest_index = 0;
    int lowest_index = 0;
    double summation = 0;
    double average = 0;
    for(int i = 1; i<n; i++){
      if(arr1[i]>arr1[highest_index]){
        highest_index = i;
      }
      if(arr1[i]<arr1[lowest_index]){
        lowest_index = i;
      }
    }

    for(int i = 0;i<n;i++){
      summation+=arr1[i];
    }
    average = summation/n;
    System.out.println("Maximum element" + arr1[highest_index] + " found at index " + highest_index);
    System.out.println("Minimum element" + arr1[lowest_index] + " found at index " + lowest_index);
    System.out.println("Summation: " + summation);
    System.out.println("Average: " + average);
  }
}

    