//Task 10
import java.util.Scanner;
  public class Task10{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount to be paid: ");
    int needed = sc.nextInt();
    System.out.println("Enter the amount the customer gave: ");
    int paid = sc.nextInt();
      
    if(paid<needed){
      System.out.println("Please pay " + (needed-paid) + " taka more");
    }
    else{
      int change = paid-needed;
      System.out.println("The returned amount is " + change + " taka");

      int tk100 = change/100;
      int change2 = change%100;
      int tk50 = change2/50;
      int change3 = change2%50;
      int tk20 = change3/20;
      int change4 = change3%20;
      int tk10 = change4/10;
      int change5 = change4%10;
      int tk5 = change5/5;
      int change6 = change5%5;
      int tk2 = change6/2;
      int change7 = change6%2;
      int tk1 = change7/1;
      int change8 = change7%1;

      System.out.println("100 taka notes: " + tk100);
      System.out.println("50 taka notes: " + tk50);
      System.out.println("20 taka notes: " + tk20);
      System.out.println("10 taka notes: " + tk10);
      System.out.println("5 taka notes: " + tk5);
      System.out.println("2 taka notes: " + tk2);
      System.out.println("1 taka notes: " + tk1);
     
    }   
  }
}