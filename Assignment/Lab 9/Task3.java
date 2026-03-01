public class Task3{
  public static void main(String[]args){
    int n = 12345;
    int x = sumDigits(n);
    System.out.println(x);
  }
  public static int sumDigits(int num){
    if(num==0){
      return 0;
    }
    else{
      return num%10 + sumDigits(num/10);
    }
  }
}