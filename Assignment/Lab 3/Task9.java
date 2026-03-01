import java.util.Scanner;
public class Task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int n = sc.nextInt();
    int nonNegative = 0;
    int negative = 0;
    for(int i = 1; i<=n;i++){
      System.out.print("Enter number " + i + ":");
      int num = sc.nextInt();
      if(num>=0){
        nonNegative++;
      }
      else{
        negative++;
      }
    }
    System.out.println(nonNegative + " Non-negative Numbers");
    System.out.println(negative + " Negative numbers");
  }
}
