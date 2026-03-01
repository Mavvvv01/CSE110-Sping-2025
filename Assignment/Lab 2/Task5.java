//Task 5
import java.util.Scanner;
  public class Task5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    if(num<0){
      System.out.println("The number is negative");
    }
    else if (num ==0){
      System.out.println("The number is zero");
    }
    else if (num>0 && num%2==0){
      System.out.println("The number is positive and even");
    }
    else{
      System.out.println("The number is positive and odd");
    }
  }
  }