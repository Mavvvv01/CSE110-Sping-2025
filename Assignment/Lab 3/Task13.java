import java.util.Scanner;
public class Task13{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int num = sc.nextInt();
    int count = 0;
    if(num ==0){
      count = 1;
    }
    for(int num2=num;num2>0;num2/=10){
      count++;
    }
    System.out.println("Total digits = " + count);
  }
}

    
    