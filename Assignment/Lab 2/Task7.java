//Task 7
import java.util.Scanner;
  public class Task7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("Enter your salary: ");
    int salary = sc.nextInt();
    if(age>=18 && salary<10000){
      System.out.println("Your tax amounts in 0 taka");
    }
    else if(age>=18 && salary<20000 && salary>=10000){
      System.out.println("Your tax amounts in " + 0.05*salary);
    }
    else if(age>=18 && salary>20000){
      System.out.println("Your tax amounts in " + 0.1*salary);
    }
    else{
      System.out.println("Your tax amounts in 0");
    }
  }
  }