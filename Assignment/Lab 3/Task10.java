import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number of terms: ");
    int n=sc.nextInt();
    int sum = 0;
    System.out.println("The odd numbers are: ");
    for(int i=1;i<=n*2;i+=2){
      System.out.println(i);
      sum +=i;
    }
    System.out.println("The Sum of odd Natural Numbers up to 5 terms is: " + sum);
  }
}