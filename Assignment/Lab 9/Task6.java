public class Task6{
  public static void main(String[]args){
    int x = power(5, 3);
    System.out.println(x);
  }
  public static int power(int base, int exponent){
    if(exponent==0){
      return 1;
    }
    else{
      return base * power(base, exponent-1);
    }
  }
}