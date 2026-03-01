import java.util.Scanner;
public class Task15{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int temp = num; 
    int digits = 0;    
    while (temp!=0){
      temp/=10;
      digits++;
    }
    int divisor = 1;
    for(int i = 1; i<digits; i++){
      divisor*=10;
    }
    while(divisor !=0){
      System.out.print(num/divisor + ", ");
      num %=divisor;
      divisor/=10;
    }
  }
}
    