//Task6
import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double t = calcTax(20,18000);
    System.out.println(t);
    calcYearlyTax();
  }
  public static double calcTax(double n1, double n2){
    if(n1<18){
      return 0.0;
    }
    if(n2<=10000){
      return 0.0;
    }else if(n2>10000 && n2<=20000){
      return n2*0.07;
    }else{
      return n2*0.14;
    }
  }
  public static void calcYearlyTax(){
    Scanner sc = new Scanner(System.in);
    double age = sc.nextInt();
    double total = 0;
    for(int i = 1; i<=12; i++){
      double income = sc.nextInt();
      double tax = calcTax(age, income);
      total+=tax;
      System.out.println("Month"+i+ "tax: "+ tax);
    }
    System.out.println("Total Yearly Tax: " + total);
  }
}
    