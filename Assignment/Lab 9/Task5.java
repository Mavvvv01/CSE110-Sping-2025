public class Task5{
  public static void main(String[]args){
    int n = 7;
    int x = factorial(n);
    System.out.println(x);
  }
  public static int factorial(int input){
    if(input==0){
      return 1;
    }
    else{
      return input*factorial(input-1);
    }
  }
}