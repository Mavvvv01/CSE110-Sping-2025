import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int counter = 1;
    int num = 3;
    System.out.println("2");
    while(counter<N){
      boolean isPrime = true;
      for(int i =2; i<num;i++){
        if(num%i==0){
          isPrime = false;
          break;
        }
      }
      if(isPrime){
        System.out.println(num);
        counter++;
        
      }
      num++;
    }
  }
}
      
    