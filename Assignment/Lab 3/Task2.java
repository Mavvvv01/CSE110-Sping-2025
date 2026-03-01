import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter N: ");
    int n = sc.nextInt();
    int sum = 0;
    
    System.out.println("Input the " + n + " numbers: ");
    for(int i =1;i<=n;i++){
      int num = sc.nextInt();
      sum +=num;
    }
    double average = (double)sum / n;
    System.out.println("The sum of " + n + " no is : " +sum);
    System.out.println("The average is: " + average);
  }    
}