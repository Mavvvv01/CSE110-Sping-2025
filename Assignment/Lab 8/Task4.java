//Task4
import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean check1 = isPrime(4);
    System.out.println(check1);
    boolean check2 = isPerfect(33);
    System.out.println(check2);
    int input = sc.nextInt();
    int result = special_sum(input);
    System.out.println(result);
  }
  public static boolean isPrime(int n){
    for(int i = 2; i<n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static boolean isPerfect(int n){
    int sum = 0;
    for(int i = 1;i<n;i++){
      if(n%i==0){
        sum+=i;
      }
    }
    if(sum==n){
      return true;
    }else{
      return false;
    }
  }
  public static int special_sum(int n){
    int sum = 0;
    for(int i=2; i<n; i++){
      if(isPrime(i)==true || isPerfect(i)==true){
        sum+=i;
      }
    }
    return sum;
  }
}
    
