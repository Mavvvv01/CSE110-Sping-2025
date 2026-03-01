import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    oneToN(1, N);
    System.out.println();
    nToOne(1, N);
    System.out.println();
    System.out.println(recursiveSum(1, N));
  }
  public static void oneToN(int first, int last){
    if(first == last){
      System.out.print(last  + " ");
    }
    else{
      System.out.print(first + " ");
      oneToN(first+1, last);
    }
  }
  public static void nToOne(int first, int last){
    if(last == first){
      System.out.print(first + " ");
    }
    else{
      System.out.print(last + " ");
      nToOne(first, last-1);
    }
  }
  public static int recursiveSum(int first, int last){
    if(first==last){
      return last;
    }
    else{
      return first + recursiveSum(first+1, last);
    }
  }
}