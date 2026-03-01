//Task 4
import java.util.Scanner;
public class Task4NotMe{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n;i++){
      int s = 1;
      for(int j = 1; j<=n-1; j++){
        System.out.print(" ");
        s++;
      }
      for(int k = 1; k<=i; k++){
        System.out.print(k);
        s++;}
          System.out.println(" ");
    }
  }
}