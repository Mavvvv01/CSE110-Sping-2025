//Task 6
import java.util.Scanner;
  public class Task6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x = sc.nextInt();
    if(x<0){
      System.out.println(x*2);
    }
    else if(x>=0 && x<2){
      System.out.println(x+1);
    }
    else if(2<=x && x<5){
      System.out.println((x*x)+1);
    }
    else{
      System.out.println((3*x*x)+2);
    }
  }
  }